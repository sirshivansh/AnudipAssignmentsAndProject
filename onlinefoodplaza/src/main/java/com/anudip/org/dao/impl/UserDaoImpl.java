package com.anudip.org.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.anudip.org.dao.UserDao;
import com.anudip.org.dto.UserDTO;
import com.anudip.org.utility.DbConnection;

public class UserDaoImpl implements UserDao {
	
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	

	@Override
	public boolean addUser(UserDTO user) {
		try {
			con = DbConnection.makeConnection();
			ps = con.prepareStatement("insert into tbl_user(first_name,last_name,email,password) values(?,?,?,?)");
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());			
			
			int rows = ps.executeUpdate();
			if(rows>0)
				return true;
			else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateUser(UserDTO user) {
		try {
			con = DbConnection.makeConnection();
			ps = con.prepareStatement("update tbl_user set first_name=?, last_name=?, password=? where email=?");
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getEmail());
			
			int rows = ps.executeUpdate();
			if(rows > 0)
				return true;
			else
				return false;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUser(String email) {
		try {
			con = DbConnection.makeConnection();
			ps = con.prepareStatement("delete from tbl_user where email=?");
			ps.setString(1, email);
			
			int rows = ps.executeUpdate();
			if(rows > 0)
				return true;
			else
				return false;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<UserDTO> showAllUsers() {
		List<UserDTO> userList = new java.util.ArrayList<>();
		try {
			con = DbConnection.makeConnection();
			ps = con.prepareStatement("select * from tbl_user");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				UserDTO user = new UserDTO(
					rs.getInt("user_id"),
					rs.getString("first_name"),
					rs.getString("last_name"),
					rs.getString("email"),
					rs.getString("password")
				);
				userList.add(user);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public UserDTO searchUser(String email) {
		try {
			con = DbConnection.makeConnection();
			ps = con.prepareStatement("select * from tbl_user where email=?");
			ps.setString(1, email);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				return new UserDTO(
					rs.getInt("user_id"),
					rs.getString("first_name"),
					rs.getString("last_name"),
					rs.getString("email"),
					rs.getString("password")
				);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean validateUser(String email, String password) {
		try {
			con = DbConnection.makeConnection();
			ps = con.prepareStatement("select * from tbl_user where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean changePassword(String email, String newPassword) {
		try {
			con = DbConnection.makeConnection();
			ps = con.prepareStatement("update tbl_user set password=? where email=?");
			ps.setString(1, newPassword);
			ps.setString(2, email);
			int rows = ps.executeUpdate();
			return rows > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
