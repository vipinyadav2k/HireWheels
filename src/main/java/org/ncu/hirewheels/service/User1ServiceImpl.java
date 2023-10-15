package org.ncu.hirewheels.service;

import org.ncu.hirewheels.model.User1;
import org.ncu.hirewheels.repository.User1Repository;
import org.ncu.hirewheels.web.dto.User1Dto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class User1ServiceImpl implements User1Service {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private User1Repository user1Repository;



	@Override
	public User1 save(User1Dto user1Dto) {
		user1Dto.setRole("USER");
		User1 user = new User1(user1Dto.getEmail(), passwordEncoder.encode(user1Dto.getPassword()) , user1Dto.getRole(), user1Dto.getFullname());
		return user1Repository.save(user);
	}



	@Override
	public User1 getUserByEmail(String email) {
	    return user1Repository.findByEmail(email);
	}

}