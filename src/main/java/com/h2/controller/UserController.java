package com.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.h2.exception.ResourceNotFoundException;
import com.h2.model.User;
import com.h2.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/v1/users")
	public List<User> getAllEmployees() {
		log.info("===Getting all users===");
		return userRepository.findAll();
	}

	@GetMapping("/v1/users/{id}")
	public ResponseEntity<User> getEmployeeById(@PathVariable Integer id) throws ResourceNotFoundException {
		log.info("===Getting user by id:{}", id);
		User user = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id=" + id));
		return ResponseEntity.ok().body(user);
	}

}
