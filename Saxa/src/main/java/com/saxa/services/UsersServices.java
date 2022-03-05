package com.saxa.services;

import java.util.List;

import com.saxa.dtos.UserDTO;

public class UsersServices {
	
	public UserDTO searchByIdV2(List<UserDTO> users, Integer id) {
		return users.stream()
				.filter(user1 -> user1.getId() == id )
				.findFirst()
				.orElse(null);
	}
	
}
