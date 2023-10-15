package org.ncu.hirewheels.service;

import org.ncu.hirewheels.model.User1;
import org.ncu.hirewheels.web.dto.User1Dto;

public interface User1Service {


	User1 save (User1Dto user1Dto);

	User1 getUserByEmail(String email);
	
}
