package javaAdvance;

import java.util.Scanner;

public class PaymentApp {
	
	// payment selection
	// login DB
	// login logic
	// payment completion msg
	
	String usernameDB, passwordDB;
	Scanner scan = new Scanner(System.in);
	
	PaymentApp(){
		this.usernameDB = usernameDB();
		this.passwordDB = passwordDB();
	}
	
	String[] loginDB() {
		String[] loginCredentials = {"david12", "d@123"};
		return loginCredentials;
	}
	
	String usernameDB() {
		return loginDB()[0];
	}
	
	String passwordDB() {
		return loginDB()[1];
	}
	
	void paymentCompletionMsg() {
		System.out.println("Payment process begin!");
		System.out.println("Enter amount to be paid: ");
		int amount = scan.nextInt();
		System.out.println("Payment of $"+amount+" is successful. Receipt emailed!");
	}
	
	void loginLogic() {
		System.out.print("Enter username: ");
		String username = scan.nextLine();
		System.out.print("Enter password: ");
		String password = scan.nextLine();
		if(username.equalsIgnoreCase(usernameDB) && password.equals(passwordDB)) {
			System.out.println("Login successful. Welcome back "+usernameDB);
			paymentCompletionMsg();
		}else if(username.isBlank() || password.isBlank() || username.isEmpty() || password.isEmpty()) {
			System.err.println("Login denied. Please enter username & password correctly!");
		}else {
			System.err.println("Login unsuccessful. Either username or password is invalid!");
			loginLogic();
		}
	}
	
	void paymentSelection() {
		System.out.print("Select desire payment option (Debit|Credit|PayPal|Cash): ");
		String customerPaymentSelection = scan.nextLine().toLowerCase();
		
		switch(customerPaymentSelection){
		case "debit":
			System.out.println("Swipe/Insert Debit card into the slot.");
			break;
		case "credit":
			System.out.println("Swipe/Insert Credit card into the slot.");
			break;
		case "paypal":
			System.out.println("Please login using PayPal credentials.");
			loginLogic();
			break;

		case "cash":
			System.out.println("Insert bills into the cash acceptor.");
			break;
		default:
			System.err.println("Invalid input.\nOnly these payment option (Debit|Credit|PayPal|Cash) are allowed.");
		}
	}

	public static void main(String[] args) {
		PaymentApp app = new PaymentApp();
		app.paymentSelection();
	}
	
	// Assignment:
			// 1. BMI/Temperature conversion/Weight conversion/Currency conversion/Library/Customer Registration/Login functionality/Thermostat/Sprinkler features -> one main class for execution

}
