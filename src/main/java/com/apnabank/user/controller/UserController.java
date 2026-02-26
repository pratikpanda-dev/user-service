package com.apnabank.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apnabank.user.dto.CreateUserRequest;
import com.apnabank.user.dto.UserDto;
import com.apnabank.user.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;

	/*
	 * public UserController(UserService service) { this.userService = service; }
	 */

	@PostMapping("/create")
	public ResponseEntity<UserDto> create(@RequestBody CreateUserRequest userRequest) {
		return ResponseEntity.ok(userService.createUser(userRequest));
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDto> get(@PathVariable("id") Long id) {
		return ResponseEntity.ok(userService.getUserById(id));
	}
	
	@GetMapping("/ping")
	public String ping() {
	    System.out.println("PING HIT");
	    return "USER SERVICE OK";
	}

}
