package com.punenightlife.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.punenightlife.dao.AddClubRepository;
import com.punenightlife.models.AddClub;
import com.punenightlife.services.AddClubService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")
public class AddClubController {

	@Autowired
	AddClubService addClubService;
	
	@Autowired
	AddClubRepository addClubRepository;
	


	
	//@PreAuthorize("hasRole('ADMIN')")
//	@PostMapping("/add_club")
	@PostMapping(value = "/add_club")
	public ResponseEntity<String> ResponseEntity(
			@RequestParam("clubName") String clubName, 
			@RequestParam("description") String description, 
			@RequestParam("location") String location,
			@RequestParam("latitude") String latitude,
			@RequestParam("longitude") String longitude,
			@RequestParam("guestListclosingTime") String guestListclosingTime,
			@RequestParam("tags") String tags,
			@RequestParam("isGuestListAvailable") String isGuestListAvailable,
			@RequestParam("min_age") String min_age,
			@RequestParam("offers") String offers,
			@RequestParam("walkinCoverCharges") String walkinCoverCharges,
			@RequestParam("guestlistCoverCharges") String guestlistCoverCharges,
			@RequestParam("guestlistAvailableDays") String guestlistAvailableDays,
			@RequestParam("entry_fees") int entry_fees, 
			@RequestParam("note") String note, 
			@RequestParam("imageData") MultipartFile imageData) {

		try {
			AddClub clubInfo = new AddClub();
			clubInfo.setClubName(clubName);
			clubInfo.setDescription(description);
			clubInfo.setLocation(location);
			clubInfo.setLatitude(latitude);
			clubInfo.setLongitude(longitude);
			clubInfo.setTags(tags);
			clubInfo.setGuestListclosingTime(guestListclosingTime);
			clubInfo.setIsGuestListAvailable("True");
			clubInfo.setMin_age(min_age);
			clubInfo.setOffers(offers);
			clubInfo.setEntry_fees(entry_fees);
			clubInfo.setImageData(imageData.getBytes());
			clubInfo.setWalkinCoverCharges(walkinCoverCharges);
			clubInfo.setGuestlistCoverCharges(guestlistCoverCharges);
			clubInfo.setGuestlistAvailableDays(guestlistAvailableDays);
			clubInfo.setNote(note);
			
			addClubRepository.save(clubInfo);

			return ResponseEntity.ok("Image uploaded successfully.");
		} catch (IOException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Image upload failed.");
		}

	}
	@GetMapping("/get_list_of_clubs")
	public List<AddClub> getListOfParties() {
		return (List<AddClub>) addClubService.getListOfParties();
	}

	@GetMapping("/get_club_by_id/{id}")
	public AddClub getById(@PathVariable("id") int id) {
		return addClubService.getBookingById(id);
	}

	//@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/delete_club_by_id/{id}")
	public void deleteChapter(@PathVariable("id") int id) {
		addClubService.deleteBooking(id);
	}

	//@PreAuthorize("hasRole('ADMIN')")
	
	/*
	 * @PutMapping("/update_club") public void saveOrUpdate(@RequestBody AddClub
	 * chapter) { System.out.println("Update Club DTO" + chapter);
	 * addClubService.saveOrUpdate(chapter); }
	 */
	
	@PutMapping("/update_club")
	public ResponseEntity<String> saveOrUpdate(
			@RequestParam("clubID") int clubID,
			@RequestParam("clubName") String clubName, 
			@RequestParam("description") String description, 
			@RequestParam("location") String location,
			@RequestParam("latitude") String latitude,
			@RequestParam("longitude") String longitude,
			@RequestParam("guestListclosingTime") String guestListclosingTime,
			@RequestParam("tags") String tags,
			@RequestParam("isGuestListAvailable") String isGuestListAvailable,
			@RequestParam("min_age") String min_age,
			@RequestParam("offers") String offers,
			@RequestParam("walkinCoverCharges") String walkinCoverCharges,
			@RequestParam("guestlistCoverCharges") String guestlistCoverCharges,
			@RequestParam("guestlistAvailableDays") String guestlistAvailableDays,
			@RequestParam("entry_fees") int entry_fees, 
			@RequestParam("note") String note, 
			@RequestParam(value = "imageData", required = 
false ) MultipartFile imageData ) {

		try {
			AddClub clubInfo = new AddClub();
			clubInfo.setClubID(clubID);
			clubInfo.setClubName(clubName);
			clubInfo.setDescription(description);
			clubInfo.setLocation(location);
			clubInfo.setLatitude(latitude);
			clubInfo.setLongitude(longitude);
			clubInfo.setTags(tags);
			clubInfo.setGuestListclosingTime(guestListclosingTime);
			clubInfo.setIsGuestListAvailable(isGuestListAvailable);
			clubInfo.setMin_age(min_age);
			clubInfo.setOffers(offers);
			clubInfo.setEntry_fees(entry_fees);
			if(imageData != null ) {
				clubInfo.setImageData(imageData.getBytes());
			}
			clubInfo.setWalkinCoverCharges(walkinCoverCharges);
			clubInfo.setGuestlistCoverCharges(guestlistCoverCharges);
			clubInfo.setGuestlistAvailableDays(guestlistAvailableDays);
			clubInfo.setNote(note);
			
			addClubService.saveOrUpdate(clubInfo);

			return ResponseEntity.ok("updated successfully.");
		} catch (IOException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Image upload failed.");
		}

	}

}
