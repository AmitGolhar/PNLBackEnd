package com.punenightlife.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.punenightlife.models.User;

@Repository
public interface ForgotPasswordRepo extends JpaRepository<User, Long> {
	User findByEmail(String email);

	User findByToken(String token);
}
