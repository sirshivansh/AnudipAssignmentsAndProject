package com.anudip.org.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.anudip.org.controller.UserController;
import com.anudip.org.dto.UserDTO;

public class Dashboard {
	public static void main(String[] args) {
		
		
		UserController userController = new UserController();

		System.out.println("Welcome to Online Food Plaza Dashboard");
		System.out.println("======================================\n");

		int mainDashboardOption = 0;
		int adminModuleOption = 0;
		int userModuleOption = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			try {

				System.out.println("Enter 1 to admin login\nEnter 2 to user login\n"
						+ "Enter 3 to create account\nEnter 4 to Exit");

				mainDashboardOption = Integer.parseInt(br.readLine());
				
				switch (mainDashboardOption) {
				case 1:					
					System.out.println("Enter admin username");
					String adminUsername = br.readLine();
					System.out.println("Enter admin password");
					String adminPassword = br.readLine();
					if(adminUsername.equals("admin") && adminPassword.equals("123")) {
						System.out.println("Login successful..\nWelcome to Admin Dashboard\n*******************");
						do {
							
							System.out.println("Enter 1 to add food item\nEnter 2 to update food item"
									+ "\nEnter 3 to delete food item\nEnter 4 to show all "
									+ "food item\nEnter 5 to search any food item"+ "\nEnter 6 to Show all user"
									+ "\nEnter 7 to Search any user\nEnter 8 to check all orders"
									+ "\nEnter 9 to search any order\nEnter 10 to Exit from admin dashboard");
							adminModuleOption = Integer.parseInt(br.readLine());
							switch(adminModuleOption) {
							case 1:
								System.out.println("Food added");
								break;
							case 2:
								System.out.println("Food updated");
								break;
							case 3:
								System.out.println("Food deleted");
								break;
							case 4:
								System.out.println("All Food items displayed");
								break;
							case 5:
								System.out.println("Food Searched");
								break;
							case 6:
								System.out.println("All user displayed...");
								break;
							case 7:
								System.out.println("User searched...");
								break;
							case 8:
								System.out.println("All orders displayed...");
								break;
							case 9:
								System.out.println("Order searched...");
								break;
							case 10:
								System.out.println("Exited from admin dashboard...");
								break;
							default:
								System.out.println("Invalid option entered.");
								break;
							}
						}while(adminModuleOption != 10);
					}
					else
						System.out.println("Username or password in invalid. Please try again");
					break;
				case 2:
					System.out.println("Enter username");
					String username = br.readLine();
					System.out.println("Enter user password");
					String userPassword = br.readLine();
					
					if(username.equals("user") && userPassword.equals("123")) {
						do {
							System.out.println("Enter 1 to show all food item\nEnter 2 to Change password\n"
									+ "Enter 3 to Delete account\nEnter 4 to Add item in cart\nEnter 5 to show cart items"
									+ "\nEnter 6 to book an Order\nEnter 7 to Exit from user module   ");
							userModuleOption = Integer.parseInt(br.readLine());
							switch (userModuleOption) {
							case 1:
								System.out.println("All food item displayed...");
								break;
							case 2:
								System.out.println("Password has been changed.....");
								break;
							case 3:
								System.out.println("Account deleted...");
								break;
							case 4:
								System.out.println("Items added in cart...");
								break;
							case 5:
								System.out.println("All cart item displayed...");
								break;
							case 6:
								System.out.println("Order booked...");
								break;
							case 7:
								System.out.println("Exited from user module...");
								break;

							default:
								System.out.println("Invalid option selected..");
								break;
							}
						}while(userModuleOption != 7);
					}else {
						System.out.println("Something went wrong to login user account");
					}
					
					break;
				case 3:
					System.out.println("Enter first name");
					String firstName = br.readLine();
					System.out.println("Enter last name");
					String lastName = br.readLine();
					System.out.println("Enter email");
					String email = br.readLine();
					System.out.println("Enter password");
					String password = br.readLine();
					UserDTO user = new UserDTO(firstName, lastName, email, password);
					boolean isUserCreated = userController.createUser(user);
					if(isUserCreated) {
						System.out.println("User created successfully..");
					}else {
						System.out.println("Something went wrong to create user");
					}
					break;
				case 4:
					System.out.println("Signed out successfully.");
					break;
				default:
					System.out.println("Invalid option");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (mainDashboardOption != 4);

	}

}
