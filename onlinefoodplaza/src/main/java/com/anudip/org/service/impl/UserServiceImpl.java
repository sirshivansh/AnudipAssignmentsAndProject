package com.anudip.org.service.impl;

import java.util.List;

import com.anudip.org.dao.UserDao;
import com.anudip.org.dao.impl.UserDaoImpl;
import com.anudip.org.dto.UserDTO;
import com.anudip.org.service.UserService;

public class UserServiceImpl implements UserService {
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public boolean addUser(UserDTO user) {
		System.out.println("From Service layer: "+user);
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public boolean updateUser(UserDTO user) {
		System.out.println("From Service layer (update): " + user);
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(String email) {
		System.out.println("From Service layer (delete): " + email);
		return userDao.deleteUser(email);
	}

	@Override
	public List<UserDTO> showAllUsers() {
		return userDao.showAllUsers();
	}

	@Override
	public UserDTO searchUser(String email) {
		return userDao.searchUser(email);
	}

	@Override
	public boolean validateUser(String email, String password) {
		return userDao.validateUser(email, password);
	}

	@Override
	public boolean changePassword(String email, String newPassword) {
		return userDao.changePassword(email, newPassword);
	}

}
