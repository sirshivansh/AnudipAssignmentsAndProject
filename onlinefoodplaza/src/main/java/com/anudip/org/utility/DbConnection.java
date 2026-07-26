package com.anudip.org.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static Connection con = null;
	
	
	public static Connection makeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_food_plaza", "root","root");
			return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	

	public static void main(String[] args) {
		Connection connection = DbConnection.makeConnection();
		if(connection !=null)
			System.out.println("Connected...");
		else
			System.out.println("Not connected..");

	}

}
