package javaBasics;

import java.util.Scanner;

public class ConditionConcept {
	// Condition concept -> helps to create condition for execution of action/s based on condition fulfillment
	
	// if(condition_1){action-1} -> needs condition
	// else if(condition_2){action-2} -> needs condition, can be used multiple times
	// else{action-3} -> default
	
	// && -> And operator -> increase number of conditions, where all condition should be fulfilled for action be performed
	// || -> Or operator -> increase number of conditions, either or condition fulfillment then action will be executed
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String customerDB, customerEnteringBuilding;
//		customerDB = "alex";
//		System.out.print("Enter your name: ");
//		customerEnteringBuilding = scan.nextLine();
//		scan.close();
		
		// if & else
//		if(customerEnteringBuilding.equalsIgnoreCase(customerDB)) {
//			System.out.println("Access granted!");
//		}else{
//			System.err.println("Access denied!");
//		}
		
		// if
//		if(customerEnteringBuilding.equalsIgnoreCase(customerDB)) {
//			System.out.println("Access granted!");
//		}
		
		// if, else if & else
//		if(customerEnteringBuilding.isBlank()) {
//			System.err.println("Name wasn't entered. Please try again!");
//		}else if(customerEnteringBuilding.equalsIgnoreCase(customerDB)) {
//			System.out.println("Access granted!");
//		}else{
//			System.err.println("Access denied!");
//		}
		
//		if(customerEnteringBuilding.isBlank()) {
//			System.err.println("Name wasn't entered. Please try again!");
//		}else if(customerEnteringBuilding.equalsIgnoreCase(customerDB)) {
//			System.out.println("Access granted!");
//		}else if(customerEnteringBuilding.isEmpty()) {
//			System.err.println("Name wasn't entered. Please try again!");
//		}else{
//			System.err.println("Access denied!");
//		}
		
		// login functionality
		String username,password,usernameDB,passwordDB;
		usernameDB = "alex12";
		passwordDB = "a@123";
		
		System.out.print("Enter username: ");
		username = scan.nextLine();
		System.out.print("Enter password: ");
		password = scan.nextLine();
		scan.close();
		
		if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
			System.out.println("Login successful. Welcome back "+usernameDB);
		}else if(username.isBlank() || password.isBlank() || username.isEmpty() || password.isEmpty()) {
			System.err.println("Login denied. Please enter username & password correctly!");
		}else {
			System.err.println("Login unsuccessful. Either username or password is invalid!");
		}

	}

}
