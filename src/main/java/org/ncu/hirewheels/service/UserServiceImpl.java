package org.ncu.hirewheels.service;

import org.ncu.hirewheels.model.User;
import org.ncu.hirewheels.model.Role;
import org.ncu.hirewheels.repository.UserRepository;
import org.ncu.hirewheels.web.dto.UserRegistrationDto;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	@Override
	public User save(UserRegistrationDto registrationDto) {
		// TODO Auto-generated method stub
		return null;
	}

	

//    private UserRepository userRepository;
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired // Add this annotation to inject the BCryptPasswordEncoder bean
//    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public User save(UserRegistrationDto registrationDto) {
//        User user = new User(registrationDto.getFirstName(),
//                registrationDto.getLastName(), registrationDto.getEmail(),
//                passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
//
//        return userRepository.save(user);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        User user = userRepository.findByEmail(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("Invalid username or password.");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
//    }
//
//    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
//        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
//    }
}
