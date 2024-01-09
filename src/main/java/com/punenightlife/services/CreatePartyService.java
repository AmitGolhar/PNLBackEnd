package com.punenightlife.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punenightlife.dao.CreatePartyRepository;
import com.punenightlife.models.CreatePartyDao;

@Service
public class CreatePartyService {

	Logger logger = LoggerFactory.getLogger(CreatePartyService.class);
	
	@Autowired
	CreatePartyRepository createPartyRepository;

	public void CreateParty(CreatePartyDao createPartyDao) {
		
		 
		logger.debug("createPartyDao: " + createPartyDao.getImageData());
		createPartyRepository.save(createPartyDao);
	}

	public List<CreatePartyDao> getListOfParties() {
		return (List<CreatePartyDao>) createPartyRepository.findAll();
	}

	public CreatePartyDao getById(int id) {
		return createPartyRepository.findById(id).get();
	}

	public void deleteChapter(int id) {
		createPartyRepository.deleteById(id);
	}

	// updating a record
	public void saveOrUpdate(CreatePartyDao chapter) {
		createPartyRepository.save(chapter);
	}
}
