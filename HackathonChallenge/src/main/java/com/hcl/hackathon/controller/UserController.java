package com.hcl.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.hcl.hackathon.domain.UserDetails;
import com.hcl.hackathon.repository.UserDetailsRepository;

@CrossOrigin
@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private  UserDetailsRepository userRepository;
	
	@GetMapping("/listOfLenders")
	public ResponseEntity<?> getLenderList(){
		return ResponseEntity.ok(userRepository.findByRole("LENDER"));
	}

	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(@RequestBody JsonNode loginCredentials){
		ResponseEntity<?> response =null;
		UserDetails userDetails = userRepository.findByUsernameAndPassword(loginCredentials.get("username").asText(), loginCredentials.get("password").asText());
		if(userDetails==null){
			response = ResponseEntity.badRequest().body("Invalid login credentials");
		}else{
			response = ResponseEntity.ok(userDetails);
		}
		return response;
	}
}
