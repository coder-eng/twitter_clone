package com.twitter.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.user.dto.UserDTO;
import com.twitter.user.exception.UserException;
import com.twitter.user.service.UserService;
import com.twitter.user.service.UserServiceImpl;

@RestController
@RequestMapping(value = "/user")
public class UserApi {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/register")
	public ResponseEntity<Long> registerUser(@RequestBody UserDTO user) throws UserException{
		
		Long id = userService.registerUser(user);
		
		return new ResponseEntity<>(id, HttpStatus.CREATED);
		
	}
	
	

}
