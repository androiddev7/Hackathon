package com.hcl.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.domain.Transaction;
import com.hcl.hackathon.repository.TransactionRepository;

@CrossOrigin
@RestController
@RequestMapping(value="/transaction")
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@PostMapping("/lendingRequest")
	public ResponseEntity<?> authenticateUser(@RequestBody Transaction transaction){
		return ResponseEntity.status(HttpStatus.CREATED).body(transactionRepository.save(transaction));
	}
}
