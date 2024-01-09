package com.punenightlife.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserDto {
    
	private String firstname;
	private String  lastname;
    private String username;
    private String password;
    private String email;
    private String phone;
    private LocalDate dob;
    private String gender;
   // private String businessTitle;


    
    public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(String dob) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) ;
		LocalDate localDate = LocalDate.parse( dob, formatter ) ;
		//dob = new SimpleDateFormat("dd/MM/yyyy").format(dob);
		this.dob = localDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

     

    public User getUserFromDto(){
        User user = new User();
        user.setFirstname(firstname); 
        user.setLastname(lastname);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setDob(dob );
        user.setGender(gender);
       // user.setName(name);
       // user.setBusinessTitle(businessTitle);
        
        return user;
    }
    
}