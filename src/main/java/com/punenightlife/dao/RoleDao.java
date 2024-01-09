package com.punenightlife.dao;

 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.punenightlife.models.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Long> {
    Role findRoleByName(String name);
}