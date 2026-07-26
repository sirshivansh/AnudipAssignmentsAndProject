package com.anudip.org.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.anudip.org.controller.CartController;
import com.anudip.org.controller.FoodController;
import com.anudip.org.controller.OrderController;
import com.anudip.org.controller.UserController;
import com.anudip.org.dto.CartDTO;
import com.anudip.org.dto.FoodDTO;
import com.anudip.org.dto.OrderDTO;
import com.anudip.org.dto.UserDTO;

public class Dashboard {

    public static void main(String[] args) {

        UserController userController = new UserController();
        FoodController foodController = new FoodController();
        CartController cartController = new CartController();
        OrderController orderController = new OrderController();

        System.out.println("==========================================");
        System.out.println(" Welcome to Online Food Plaza Dashboard ");
        System.out.println("==========================================");

        int mainDashboardOption = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                System.out.println("\n--- MAIN MENU ---");
                System.out.println("1. Admin Login");
                System.out.println("2. User Login");
                System.out.println("3. Create Account");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                String input = br.readLine();
                if (input == null || input.trim().isEmpty()) continue;
                mainDashboardOption = Integer.parseInt(input.trim());

                switch (mainDashboardOption) {
                    case 1:
                        System.out.print("Enter Admin Username: ");
                        String adminUsername = br.readLine();
                        System.out.print("Enter Admin Password: ");
                        String adminPassword = br.readLine();

                        if ("admin".equals(adminUsername) && "123".equals(adminPassword)) {
                            System.out.println("\nLogin successful! Welcome to Admin Dashboard.");
                            int adminModuleOption = 0;
                            do {
                                System.out.println("\n=== ADMIN DASHBOARD ===");
                                System.out.println("1. Add Food Item");
                                System.out.println("2. Update Food Item");
                                System.out.println("3. Delete Food Item");
                                System.out.println("4. Show All Food Items");
                                System.out.println("5. Search Food Item");
                                System.out.println("6. Show All Users");
                                System.out.println("7. Search User by Email");
                                System.out.println("8. Check All Orders");
                                System.out.println("9. Search Order by ID");
                                System.out.println("10. Exit Admin Dashboard");
                                System.out.print("Select an option: ");

                                adminModuleOption = Integer.parseInt(br.readLine().trim());

                                switch (adminModuleOption) {
                                    case 1:
                                        System.out.print("Enter Food Name: ");
                                        String name = br.readLine();
                                        System.out.print("Enter Food Type (Veg/Non-Veg): ");
                                        String type = br.readLine();
                                        System.out.print("Enter Category: ");
                                        String category = br.readLine();
                                        System.out.print("Enter Price: ");
                                        double price = Double.parseDouble(br.readLine().trim());

                                        FoodDTO newFood = new FoodDTO(name, type, category, price);
                                        if (foodController.addFood(newFood)) {
                                            System.out.println("SUCCESS: Food item added successfully!");
                                        } else {
                                            System.out.println("ERROR: Failed to add food item.");
                                        }
                                        break;

                                    case 2:
                                        System.out.print("Enter Food ID to update: ");
                                        int uId = Integer.parseInt(br.readLine().trim());
                                        System.out.print("Enter New Food Name: ");
                                        String uName = br.readLine();
                                        System.out.print("Enter New Food Type (Veg/Non-Veg): ");
                                        String uType = br.readLine();
                                        System.out.print("Enter New Category: ");
                                        String uCategory = br.readLine();
                                        System.out.print("Enter New Price: ");
                                        double uPrice = Double.parseDouble(br.readLine().trim());

                                        FoodDTO updateFood = new FoodDTO(uId, uName, uType, uCategory, uPrice);
                                        if (foodController.updateFood(updateFood)) {
                                            System.out.println("SUCCESS: Food item updated successfully!");
                                        } else {
                                            System.out.println("ERROR: Failed to update food item.");
                                        }
                                        break;

                                    case 3:
                                        System.out.print("Enter Food ID to delete: ");
                                        int dId = Integer.parseInt(br.readLine().trim());
                                        if (foodController.deleteFood(dId)) {
                                            System.out.println("SUCCESS: Food item deleted successfully!");
                                        } else {
                                            System.out.println("ERROR: Failed to delete food item.");
                                        }
                                        break;

                                    case 4:
                                        List<FoodDTO> foods = foodController.showAllFood();
                                        if (foods.isEmpty()) {
                                            System.out.println("No food items available.");
                                        } else {
                                            System.out.println("\n--- ALL FOOD ITEMS ---");
                                            for (FoodDTO f : foods) {
                                                System.out.println(f);
                                            }
                                        }
                                        break;

                                    case 5:
                                        System.out.print("Enter Food Name/Keyword to Search: ");
                                        String kw = br.readLine();
                                        List<FoodDTO> searchResults = foodController.searchFoodByName(kw);
                                        if (searchResults.isEmpty()) {
                                            System.out.println("No matching food items found.");
                                        } else {
                                            System.out.println("\n--- SEARCH RESULTS ---");
                                            for (FoodDTO f : searchResults) {
                                                System.out.println(f);
                                            }
                                        }
                                        break;

                                    case 6:
                                        List<UserDTO> users = userController.showAllUsers();
                                        if (users.isEmpty()) {
                                            System.out.println("No users registered.");
                                        } else {
                                            System.out.println("\n--- REGISTERED USERS ---");
                                            for (UserDTO u : users) {
                                                System.out.println(u);
                                            }
                                        }
                                        break;

                                    case 7:
                                        System.out.print("Enter User Email: ");
                                        String sEmail = br.readLine();
                                        UserDTO searchedUser = userController.searchUser(sEmail);
                                        if (searchedUser != null) {
                                            System.out.println("User Details: " + searchedUser);
                                        } else {
                                            System.out.println("User not found.");
                                        }
                                        break;

                                    case 8:
                                        List<OrderDTO> orders = orderController.showAllOrders();
                                        if (orders.isEmpty()) {
                                            System.out.println("No orders placed yet.");
                                        } else {
                                            System.out.println("\n--- ALL ORDERS ---");
                                            for (OrderDTO o : orders) {
                                                System.out.println(o);
                                            }
                                        }
                                        break;

                                    case 9:
                                        System.out.print("Enter Order ID: ");
                                        int oId = Integer.parseInt(br.readLine().trim());
                                        OrderDTO searchedOrder = orderController.searchOrderById(oId);
                                        if (searchedOrder != null) {
                                            System.out.println("Order Details: " + searchedOrder);
                                        } else {
                                            System.out.println("Order not found.");
                                        }
                                        break;

                                    case 10:
                                        System.out.println("Exited from Admin Dashboard.");
                                        break;

                                    default:
                                        System.out.println("Invalid option! Please try again.");
                                        break;
                                }
                            } while (adminModuleOption != 10);
                        } else {
                            System.out.println("ERROR: Invalid Admin username or password!");
                        }
                        break;

                    case 2:
                        System.out.print("Enter User Email: ");
                        String userEmail = br.readLine();
                        System.out.print("Enter User Password: ");
                        String userPassword = br.readLine();

                        boolean isValidUser = userController.loginUser(userEmail, userPassword);
                        if (isValidUser) {
                            System.out.println("\nLogin successful! Welcome, " + userEmail);
                            int userModuleOption = 0;
                            do {
                                System.out.println("\n=== USER MENU ===");
                                System.out.println("1. Show All Food Items");
                                System.out.println("2. Change Password");
                                System.out.println("3. Delete Account");
                                System.out.println("4. Add Item to Cart");
                                System.out.println("5. Show Cart Items");
                                System.out.println("6. Book an Order (Checkout Cart)");
                                System.out.println("7. View My Orders");
                                System.out.println("8. Exit User Menu");
                                System.out.print("Select an option: ");

                                userModuleOption = Integer.parseInt(br.readLine().trim());

                                switch (userModuleOption) {
                                    case 1:
                                        List<FoodDTO> foods = foodController.showAllFood();
                                        if (foods.isEmpty()) {
                                            System.out.println("No food items available.");
                                        } else {
                                            System.out.println("\n--- AVAILABLE FOOD ITEMS ---");
                                            for (FoodDTO f : foods) {
                                                System.out.println(f);
                                            }
                                        }
                                        break;

                                    case 2:
                                        System.out.print("Enter New Password: ");
                                        String newPass = br.readLine();
                                        if (userController.changePassword(userEmail, newPass)) {
                                            System.out.println("SUCCESS: Password updated successfully!");
                                        } else {
                                            System.out.println("ERROR: Failed to update password.");
                                        }
                                        break;

                                    case 3:
                                        System.out.print("Are you sure you want to delete your account? (yes/no): ");
                                        String confirm = br.readLine();
                                        if ("yes".equalsIgnoreCase(confirm)) {
                                            if (userController.deleteUser(userEmail)) {
                                                System.out.println("SUCCESS: Account deleted. Logging out...");
                                                userModuleOption = 8;
                                            } else {
                                                System.out.println("ERROR: Failed to delete account.");
                                            }
                                        }
                                        break;

                                    case 4:
                                        System.out.print("Enter Food ID to Add to Cart: ");
                                        int fId = Integer.parseInt(br.readLine().trim());
                                        System.out.print("Enter Quantity: ");
                                        int qty = Integer.parseInt(br.readLine().trim());

                                        CartDTO item = new CartDTO(fId, userEmail, qty);
                                        if (cartController.addToCart(item)) {
                                            System.out.println("SUCCESS: Item added to cart!");
                                        } else {
                                            System.out.println("ERROR: Failed to add item to cart.");
                                        }
                                        break;

                                    case 5:
                                        List<CartDTO> cartItems = cartController.showCart(userEmail);
                                        if (cartItems.isEmpty()) {
                                            System.out.println("Your cart is empty.");
                                        } else {
                                            System.out.println("\n--- YOUR CART ---");
                                            double grandTotal = 0;
                                            for (CartDTO c : cartItems) {
                                                System.out.println(c);
                                                grandTotal += c.getTotalPrice();
                                            }
                                            System.out.println("GRAND TOTAL: ₹" + grandTotal);
                                        }
                                        break;

                                    case 6:
                                        List<CartDTO> cartToCheckout = cartController.showCart(userEmail);
                                        if (cartToCheckout.isEmpty()) {
                                            System.out.println("Cannot book order: Cart is empty!");
                                        } else {
                                            double total = 0;
                                            for (CartDTO c : cartToCheckout) {
                                                total += c.getTotalPrice();
                                            }
                                            OrderDTO newOrder = new OrderDTO(userEmail, total);
                                            if (orderController.placeOrder(newOrder)) {
                                                cartController.clearCart(userEmail);
                                                System.out.println("SUCCESS: Order booked successfully for ₹" + total + "!");
                                            } else {
                                                System.out.println("ERROR: Failed to place order.");
                                            }
                                        }
                                        break;

                                    case 7:
                                        List<OrderDTO> myOrders = orderController.showUserOrders(userEmail);
                                        if (myOrders.isEmpty()) {
                                            System.out.println("You have not placed any orders yet.");
                                        } else {
                                            System.out.println("\n--- YOUR ORDERS ---");
                                            for (OrderDTO o : myOrders) {
                                                System.out.println(o);
                                            }
                                        }
                                        break;

                                    case 8:
                                        System.out.println("Exited from User Menu.");
                                        break;

                                    default:
                                        System.out.println("Invalid option! Please try again.");
                                        break;
                                }
                            } while (userModuleOption != 8);
                        } else {
                            System.out.println("ERROR: Invalid user email or password!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter First Name: ");
                        String firstName = br.readLine();
                        System.out.print("Enter Last Name: ");
                        String lastName = br.readLine();
                        System.out.print("Enter Email: ");
                        String email = br.readLine();
                        System.out.print("Enter Password: ");
                        String password = br.readLine();

                        UserDTO newUser = new UserDTO(firstName, lastName, email, password);
                        if (userController.createUser(newUser)) {
                            System.out.println("SUCCESS: Account created successfully! Please login.");
                        } else {
                            System.out.println("ERROR: Failed to create account (email may already exist).");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using Online Food Plaza! Goodbye.");
                        break;

                    default:
                        System.out.println("Invalid option selected.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (mainDashboardOption != 4);
    }
}
