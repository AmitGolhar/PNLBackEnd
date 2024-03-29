package com.punenightlife.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//import com.punenightlife.controllers.UserAlreadyExistException;
import com.punenightlife.dao.UserDao;
import com.punenightlife.models.Role;
import com.punenightlife.models.User;
import com.punenightlife.models.UserDto;
import com.punenightlife.services.RoleService;
import com.punenightlife.services.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder bcryptEncoder;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
    }

    
    
    private Set<SimpleGrantedAuthority> getAuthority(User user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        });
        return authorities;
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public User findOne(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public String save(UserDto user) {
    	
    		User nUser = user.getUserFromDto();
            nUser.setPassword(bcryptEncoder.encode(user.getPassword()));

            Role role = roleService.findByName("GUEST");
            Set<Role> roleSet = new HashSet<>();
            roleSet.add(role);

            if(nUser.getEmail().split("@")[1].equals("pnl4u.com")){
                role = roleService.findByName("ADMIN");
                roleSet.add(role);
            }

            nUser.setRoles(roleSet);
              userDao.save(nUser);
            return "Registed successfully, Kindly login with username password" + nUser;

    }
}
