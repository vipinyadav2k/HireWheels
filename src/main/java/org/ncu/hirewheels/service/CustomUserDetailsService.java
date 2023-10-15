package org.ncu.hirewheels.service;


import org.ncu.hirewheels.model.User1;
import org.ncu.hirewheels.repository.User1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	 @Autowired
	 private User1Repository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User1 user = userRepository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("user not found");
		}
		
		return new CustomUserDetail(user);

	}

}
