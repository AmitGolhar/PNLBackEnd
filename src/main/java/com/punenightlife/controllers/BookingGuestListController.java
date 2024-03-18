package com.punenightlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.punenightlife.models.AddTOGuestList;
import com.punenightlife.services.AddTOGuestListService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")
public class BookingGuestListController {

	@Autowired
	private AddTOGuestListService addTOGuestListService;

	@GetMapping("/get_booking")
	public List<AddTOGuestList> getListOfParties() {
		return (List<AddTOGuestList>) addTOGuestListService.getListOfParties();
	}
	
	@GetMapping("/get_booking/{userid}")
	public  List<AddTOGuestList> findByUserID(@PathVariable int userid) {
		
		 return addTOGuestListService.findByUserID(userid);
		   
	}
	
	@DeleteMapping("/delete_booking/{bookingID}")
	public void deleteBooking(@PathVariable int bookingID) {
		
		   addTOGuestListService.deleteBooking(bookingID);
		   
	}
}
