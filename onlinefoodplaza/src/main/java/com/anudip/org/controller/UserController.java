package com.anudip.org.controller;

import com.anudip.org.dto.UserDTO;
import com.anudip.org.service.UserService;
import com.anudip.org.service.impl.UserServiceImpl;
/*
 * Sandeep Singh
 */
public class UserController {
	
	
	UserService userService = new UserServiceImpl();
	
	
	/*
	 * Method is used to receive UserDTO
	 * to create user account
	 */
	public boolean createUser(UserDTO user) {
		boolean isUserAdded = userService.addUser(user);
		return isUserAdded;
		
	}

}
