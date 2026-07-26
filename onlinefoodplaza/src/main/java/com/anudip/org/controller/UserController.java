package com.anudip.org.controller;

import java.util.List;
import com.anudip.org.dto.UserDTO;
import com.anudip.org.service.UserService;
import com.anudip.org.service.impl.UserServiceImpl;

public class UserController {

    private UserService userService = new UserServiceImpl();

    public boolean createUser(UserDTO user) {
        return userService.addUser(user);
    }

    public boolean loginUser(String email, String password) {
        return userService.validateUser(email, password);
    }

    public boolean changePassword(String email, String newPassword) {
        return userService.changePassword(email, newPassword);
    }

    public boolean deleteUser(String email) {
        return userService.deleteUser(email);
    }

    public List<UserDTO> showAllUsers() {
        return userService.showAllUsers();
    }

    public UserDTO searchUser(String email) {
        return userService.searchUser(email);
    }
}
