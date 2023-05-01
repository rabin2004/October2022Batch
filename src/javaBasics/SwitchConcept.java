package javaBasics;

import java.util.Scanner;

public class SwitchConcept {
	
	// Switch Concept: creating multiple flow with conditions
		// switch created based on input
		// case -> number of options for the input
		// every case needs to have break keyword

	public static void main(String[] args) {
		// customer -> payment options (debit/credit/paypal/cash)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Select desire payment option (Debit|Credit|PayPal|Cash): ");
		String customerPaymentSelection = scan.nextLine().toLowerCase();
		String username,password,usernameDB,passwordDB;
		usernameDB = "alex12";
		passwordDB = "a@123";
		
		switch(customerPaymentSelection){
		case "debit":
			System.out.println("Swipe/Insert Debit card into the slot.");
			break;
		case "credit":
			System.out.println("Swipe/Insert Credit card into the slot.");
			break;
		case "paypal":
			System.out.println("Please login using PayPal credentials.");
			System.out.print("Enter username: ");
			username = scan.nextLine();
			System.out.print("Enter password: ");
			password = scan.nextLine();
			
			// paypal login
			if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
				System.out.println("Login successful. Welcome back "+usernameDB);
				System.out.println("Payment process begin!");
				System.out.println("Enter amount to be paid: ");
				int amount = scan.nextInt();
				scan.close();
				System.out.println("Payment of $"+amount+" is successful. Receipt emailed!");
			}else if(username.isBlank() || password.isBlank() || username.isEmpty() || password.isEmpty()) {
				System.err.println("Login denied. Please enter username & password correctly!");
			}else {
				System.err.println("Login unsuccessful. Either username or password is invalid!");
			}
			break;

		case "cash":
			System.out.println("Insert bills into the cash acceptor.");
			break;
		default:
			System.err.println("Invalid input.\nOnly these payment option (Debit|Credit|PayPal|Cash) are allowed.");
		}
		
//		if(customerPaymentSelection.equalsIgnoreCase("debit")) {
//			System.out.println("Swipe/Insert Debit card into the slot.");
//		}else if(customerPaymentSelection.equalsIgnoreCase("credit")) {
//			System.out.println("Swipe/Insert Credit card into the slot.");
//		}else if(customerPaymentSelection.equalsIgnoreCase("paypal")) {
//			System.out.println("Please login using PayPal credentials.");
//		}else if(customerPaymentSelection.equalsIgnoreCase("cash")) {
//			System.out.println("Insert bills into the cash acceptor.");
//		}else {
//			System.err.println("Invalid input.\nOnly these payment option (Debit|Credit|PayPal|Cash) are allowed.");
//		}
	}

}
