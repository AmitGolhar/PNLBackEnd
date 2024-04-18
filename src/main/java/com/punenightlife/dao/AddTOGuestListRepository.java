package com.punenightlife.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.punenightlife.models.AddTOGuestList;


public interface AddTOGuestListRepository extends CrudRepository<AddTOGuestList, Integer> {
	
	List<AddTOGuestList> findByUserID(int UserID );
 
}
