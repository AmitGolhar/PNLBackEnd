package com.punenightlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_list")
public class AddTOGuestList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingID;

	@Column(name = "clubID")
	String clubID;
	
	@Column(name = "guest1Name")
	String guest1Name;

	@Column(name = "guest2Name")
	String guest2Name;

	@Column(name = "bookingType")
	String bookingType;

	@Column(name = "clubName")
	String clubName;

	@Column(name = "email")
	private String email;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "date")
	private String date;

	@Column(name = "guestListClsoingTime")
	private String guestListClsoingTime;

	@Column(name = "punchStatus")
	private String punchStatus;


	@Column(name = "userID")
	int userID;

	 
	
	
	
	public AddTOGuestList() {
		super();
		// TODO Auto-generated constructor stub
	}

 

	public AddTOGuestList(int bookingID, String clubID, String guest1Name, String guest2Name, String bookingType,
			String clubName, String email, String latitude, String longitude, String date, String guestListClsoingTime,
			String punchStatus, int userID) {
		super();
		this.bookingID = bookingID;
		this.clubID = clubID;
		this.guest1Name = guest1Name;
		this.guest2Name = guest2Name;
		this.bookingType = bookingType;
		this.clubName = clubName;
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.guestListClsoingTime = guestListClsoingTime;
		this.punchStatus = punchStatus;
		this.userID = userID;
		 
	}



	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public String getClubID() {
		return clubID;
	}

	public void setClubID(String clubID) {
		this.clubID = clubID;
	}

	public String getGuest1Name() {
		return guest1Name;
	}

	public void setGuest1Name(String guest1Name) {
		this.guest1Name = guest1Name;
	}

	public String getGuest2Name() {
		return guest2Name;
	}

	public void setGuest2Name(String guest2Name) {
		this.guest2Name = guest2Name;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGuestListClsoingTime() {
		return guestListClsoingTime;
	}

	public void setGuestListClsoingTime(String guestListClsoingTime) {
		this.guestListClsoingTime = guestListClsoingTime;
	}
	
	

	public String getBookingStatus() {
		return punchStatus;
	}



	public void setBookingStatus(String punchStatus) {
		this.punchStatus = punchStatus;
	}



	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	 
	 

}
