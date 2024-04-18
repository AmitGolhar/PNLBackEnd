package com.punenightlife.controllers;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.punenightlife.config.TokenProvider;
import com.punenightlife.dao.DeleteUserDAO;
import com.punenightlife.dao.UserDao;
import com.punenightlife.models.AuthToken;
import com.punenightlife.models.LoginUser;
import com.punenightlife.models.User;
import com.punenightlife.models.UserDto;
import com.punenightlife.services.UserService;


@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenProvider jwtTokenUtil;

    @Autowired
    private UserService userService;
    
    
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private DeleteUserDAO deleteUserDAO;
    

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody LoginUser loginUser) throws AuthenticationException {
    		System.out.println("loginUser" + loginUser);
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginUser.getUsername(),
                        loginUser.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenUtil.generateToken(authentication);
        return ResponseEntity.ok(new AuthToken(token));
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String saveUser(@RequestBody UserDto user) throws UsernameNotFoundException {

    	 User usercheck = userDao.findByUsername(user.getUsername());

          if(usercheck == null){
        	 return  userService.save(user);
          } else {
          	throw new UsernameNotFoundException("This Email/Username already exist. Please try another name.");
          }
    }

    @DeleteMapping("/delete_user/{userID}")
	public void deleteBooking(@PathVariable Long userID) {
		
    	deleteUserDAO.deleteById(userID);
		   
	}
    
    
	/*
	 * @PreAuthorize("hasRole('ADMIN')")
	 * 
	 * @RequestMapping(value="/adminping", method = RequestMethod.GET) public String
	 * adminPing(){ return "Only Admins Can Read This"; }
	 * 
	 * @PreAuthorize("hasRole('GUEST')")
	 * 
	 * @RequestMapping(value="/userping", method = RequestMethod.GET) public String
	 * userPing(){ return "Any User Can Read This"; }
	 */

}
