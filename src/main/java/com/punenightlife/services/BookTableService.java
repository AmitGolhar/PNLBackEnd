package com.punenightlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punenightlife.dao.BookTableRepository;
import com.punenightlife.models.BookTable;

@Service
public class BookTableService {

	@Autowired
	BookTableRepository bookTableRepository;

	public void bookTable(BookTable addClub) {

		bookTableRepository.save(addClub);
	}

	public List<BookTable> getListOfTablesBookings() {
		return (List<BookTable>) bookTableRepository.findAll();
	}

	public BookTable getTableBookingById(int id) {
		return bookTableRepository.findById(id).get();
	}

	public void deleteTableBooking(int id) {
		bookTableRepository.deleteById(id);
	}

	public void saveOrUpdate(BookTable addClub) {
		bookTableRepository.save(addClub);
	}

}
