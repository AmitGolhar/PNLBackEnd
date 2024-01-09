package com.punenightlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punenightlife.dao.AddClubRepository;
import com.punenightlife.models.AddClub;

@Service
public class AddClubService {

	@Autowired
	AddClubRepository addClubRepository;

	public void addTOGuestList(AddClub addClub) {

		addClubRepository.save(addClub);
	}

	public List<AddClub> getListOfParties() {
		return (List<AddClub>) addClubRepository.findAll();
	}

	public AddClub getBookingById(int id) {
		return addClubRepository.findById(id).get();
	}

	public void deleteBooking(int id) {
		addClubRepository.deleteById(id);
	}

	public void saveOrUpdate(AddClub addClub) {
		addClubRepository.save(addClub);
	}

}
