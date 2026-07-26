package com.anudip.org.service;

import java.util.List;

import com.anudip.org.dto.UserDTO;

public interface UserService {
	
	boolean addUser(UserDTO user);
	boolean updateUser(UserDTO user);
	boolean deleteUser(String email);
	List<UserDTO> showAllUsers();
	UserDTO searchUser(String email);


}
