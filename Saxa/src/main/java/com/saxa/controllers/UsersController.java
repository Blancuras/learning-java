package com.saxa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saxa.dtos.UserDTO;
import com.saxa.services.UsersServices;

@RestController
public class UsersController {

	private List<UserDTO> users = new ArrayList<UserDTO>();
	
	@GetMapping("/users-db")
	public List<UserDTO> getUsersFromDB() {
		return users;
	}
	
	@GetMapping("/users-db/{id}")
	public UserDTO getUserByIdFromDB(@PathVariable Integer id) {
		UsersServices userService = new UsersServices();
		return userService.searchByIdV2(users, id);
	}
	
	@PostMapping("/add-user")
	public List<UserDTO> addUser(  @RequestBody UserDTO user){
		users.add(user);
		return users;
	}
	
	@GetMapping("/user")
	public UserDTO getUser() {
		UserDTO aileen = new UserDTO();
		aileen.setAge(14);
		aileen.setName("aileen"); 
		aileen.setNickName("peque"); 
		return aileen; 
	}

	@GetMapping("/users")
	public List<UserDTO> getUsers() {
		List<UserDTO> users = new ArrayList<UserDTO>();
		UserDTO aileen = new UserDTO();
		aileen.setAge(14);
		aileen.setName("aileen"); 
		aileen.setNickName("peque"); 
		users.add(aileen); 
		return users; 
	}
}
