package com.punenightlife.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.punenightlife.models.AddTOGuestList;
import com.punenightlife.services.AddTOGuestListService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")

public class AddTOGuestListController {

	@Autowired
	private AddTOGuestListService addTOGuestListService;

	@PostMapping("/add_to_guestlist")
	public int addToGuestList(@RequestBody AddTOGuestList addTOGuestList) {

		addTOGuestListService.addTOGuestList(addTOGuestList);
		return addTOGuestList.getBookingID();
	}

}
