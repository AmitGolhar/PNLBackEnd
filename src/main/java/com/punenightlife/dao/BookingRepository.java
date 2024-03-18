package com.punenightlife.dao;

import org.springframework.data.repository.CrudRepository;

import com.punenightlife.models.Booking;

public interface BookingRepository  extends CrudRepository<Booking, Integer> {
    
}