package com.punenightlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punenightlife.dao.AddTOGuestListRepository;
import com.punenightlife.models.AddTOGuestList;

@Service
public class AddTOGuestListService {

	@Autowired
	AddTOGuestListRepository addTOGuestListRepository;

	public void addTOGuestList(AddTOGuestList addTOGuestList) {

		addTOGuestListRepository.save(addTOGuestList);
	}

	public List<AddTOGuestList> getListOfParties() {
		return (List<AddTOGuestList>) addTOGuestListRepository.findAll();
	}

	public AddTOGuestList getBookingById(int id) {
		return addTOGuestListRepository.findById(id).get();
	}

	public void deleteBooking(int id) {
		addTOGuestListRepository.deleteById(id);
	}


	public void saveOrUpdate(AddTOGuestList addTOGuestList) {
		addTOGuestListRepository.save(addTOGuestList);
	}

}
