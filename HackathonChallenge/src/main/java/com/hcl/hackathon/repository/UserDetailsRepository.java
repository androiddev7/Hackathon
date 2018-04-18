package com.hcl.hackathon.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.hackathon.domain.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{

	UserDetails findByUsernameAndPassword(String username, String password);
	
	Collection<UserDetails> findByRole(String role);
}
