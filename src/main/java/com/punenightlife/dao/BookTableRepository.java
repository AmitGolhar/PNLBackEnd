package com.punenightlife.dao;

import org.springframework.data.repository.CrudRepository;

import com.punenightlife.models.BookTable;

public interface BookTableRepository extends CrudRepository<BookTable, Integer> {
    
}
