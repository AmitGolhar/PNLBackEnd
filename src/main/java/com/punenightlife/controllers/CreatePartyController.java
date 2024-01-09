package com.punenightlife.controllers;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.punenightlife.dao.CreatePartyRepository;
import com.punenightlife.models.CreatePartyDao;
import com.punenightlife.services.CreatePartyService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")

public class CreatePartyController {

	Logger logger = LoggerFactory.getLogger(CreatePartyService.class);

	@Autowired
	private CreatePartyService createPartyService;

	@Autowired
	CreatePartyRepository createPartyRepository;

	
	@PostMapping("/addNewParty")
	public ResponseEntity<String> ResponseEntity(

			
			@RequestParam("clubName") String clubName, 
			@RequestParam("party_title") String party_title, 
			@RequestParam("location") String location,
			@RequestParam("start_date") String start_date,
			@RequestParam("start_time") String start_time,
			@RequestParam("end_date") String end_date,
			@RequestParam("guestlist_closingtime") String guestlist_closingtime,
			@RequestParam("entry_fees") int entry_fees, 
			@RequestParam("category") String category,
			@RequestParam("tags") String tags, 
			@RequestParam("description") String description,
			@RequestParam("min_age") int min_age,
			@RequestParam("imageData") MultipartFile imageData) {

		try {
			CreatePartyDao imageInfo = new CreatePartyDao();
			imageInfo.setClubName(clubName);
			imageInfo.setParty_title(party_title);
			imageInfo.setLocation(location);
			imageInfo.setStart_date(start_date);
			imageInfo.setStart_time(start_time);
			imageInfo.setEnd_date(end_date);
			imageInfo.setGuestlist_closingtime(guestlist_closingtime);
			imageInfo.setEntry_fees(entry_fees);
			imageInfo.setCategory(category);
			imageInfo.setTags(tags);
			imageInfo.setDescription(description);
			imageInfo.setMin_age(min_age);
			imageInfo.setImageData(imageData.getBytes());

			createPartyRepository.save(imageInfo);

			return ResponseEntity.ok("Image uploaded successfully.");
		} catch (IOException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Image upload failed.");
		}

	}

	@GetMapping("/get_list_of_parties")
	public List<CreatePartyDao> getListOfChapter() {
		return createPartyService.getListOfParties();
	}

	@GetMapping("/parties/{id}")
	public CreatePartyDao getById(@PathVariable("id") int id) {

		CreatePartyDao addChapter = createPartyService.getById(id);
		//if (addChapter == null)
			// runtime exception
			//throw new UserNotFoundException("id: " + id);
		//return addChapter;
		return addChapter;

	}

	@DeleteMapping("/parties/{id}")
	public void deleteChapter(@PathVariable("id") int id) {
		createPartyService.deleteChapter(id);
	}

	@PutMapping("/update_party")
	private CreatePartyDao update(@RequestBody CreatePartyDao createPartyDao) {
		createPartyService.saveOrUpdate(createPartyDao);
		return createPartyDao;
	}
}
