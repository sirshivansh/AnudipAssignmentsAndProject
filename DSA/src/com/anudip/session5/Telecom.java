package com.anudip.session5;

//A telecom companu wants to register customer mobile numbers
//
//1)Register mobile number
//2)Duplicate mobile numbers are not allowed
//3)Display all the resigstered mobile numbers


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Telecom {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<String> mobileNumbers = new LinkedHashSet<>();
        
        int choice;
        
        do {
            System.out.println("\n===== TELECOM MOBILE REGISTRATION =====");
            System.out.println("1. Register Mobile Number");
            System.out.println("2. Display All Registered Mobile Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            
            switch (choice) {
            
                case 1:
                    System.out.print("Enter mobile number to register: ");
                    String mobile = sc.nextLine();
                    
                    if (mobileNumbers.add(mobile)) {
                        System.out.println("Mobile number registered successfully.");
                    } else {
                        System.out.println("Duplicate mobile number not allowed!");
                    }
                    break;
                    
                case 2:
                    System.out.println("\nRegistered Mobile Numbers:");
                    
                    if (mobileNumbers.isEmpty()) {
                        System.out.println("No mobile numbers registered yet.");
                    } else {
                        for (String number : mobileNumbers) {
                            System.out.println(number);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        } while (choice != 3);
        
        sc.close();
    }
}