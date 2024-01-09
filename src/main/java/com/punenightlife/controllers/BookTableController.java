package com.punenightlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.punenightlife.models.BookTable;
import com.punenightlife.services.BookTableService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")
public class BookTableController {

	@Autowired
	BookTableService bookTableService;

	@PostMapping("/book_table")
	public void BookTable(@RequestBody BookTable bookTable) {

		bookTableService.bookTable(bookTable);
	}

	@GetMapping("/get_list_of_table_bookings")
	public List<BookTable> getListOfParties() {
		return (List<BookTable>) bookTableService.getListOfTablesBookings();
	}

	@GetMapping("/get_table_booking_by_id/{id}")
	public BookTable getById(@PathVariable("id") int id) {
		return bookTableService.getTableBookingById(id);
	}

	@DeleteMapping("/delete_table_booking_by_id/{id}")
	public void deleteChapter(@PathVariable("id") int id) {
		bookTableService.deleteTableBooking(id);
	}

	@PutMapping("/update_table_booking")
	public void saveOrUpdate(BookTable chapter) {
		bookTableService.saveOrUpdate(chapter);
	}

}
