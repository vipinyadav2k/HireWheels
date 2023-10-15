package org.ncu.hirewheels.service;

import org.ncu.hirewheels.model.User;
import org.ncu.hirewheels.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
//public interface UserService extends UserDetailsService{
//	User save(UserRegistrationDto registrationDto);
//}