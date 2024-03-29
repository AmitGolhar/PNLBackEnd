package com.punenightlife.services;

 

import java.util.List;

import com.punenightlife.models.User;
import com.punenightlife.models.UserDto;

public interface UserService {
    String save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
