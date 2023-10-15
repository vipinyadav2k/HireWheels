package org.ncu.hirewheels.repository;

import java.util.List;

import org.ncu.hirewheels.model.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface User1Repository extends JpaRepository<User1, Long> {
    
	User1 findByEmail (String email);

	List<User1> findByRole(String role);
}
