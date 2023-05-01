package javaBasics;

import java.util.Scanner;

public class ScannerConcept {
	// Scanner concept -> Scanner class, create object of the class, let system accept user input

	public static void main(String[] args) {
//		String customerInDB = "Alex";
//		String customerEnteringBuilder = "Alex";
		
//		System.out.println("Let customer in: "+customerEnteringBuilder.equalsIgnoreCase(customerInDB));
//		customerEnteringBuilder = "Mac";
//		System.err.println("Deny customer entrance: "+customerEnteringBuilder.equalsIgnoreCase(customerInDB));
		
		Scanner scan = new Scanner(System.in);
//		String customerEnteringBuilder;
//		System.out.println("Enter your name: ");
//		customerEnteringBuilder = scan.nextLine(); 
//		customerEnteringBuilder = scan.next();
		// nextLine() Vs next() -> allows accept String data | nextLine()-> pushed cursor to next line, accepts white space | next()-> will keep cursor in the same line, white space is taken as end of input
//		System.out.println("Let customer in: "+customerEnteringBuilder.equalsIgnoreCase(customerInDB));
//		System.out.println("Enter your name: ");
//		customerEnteringBuilder = scan.nextLine();
//		customerEnteringBuilder = scan.next();
//		scan.close();
//		System.err.println("Deny customer entrance: "+customerEnteringBuilder.equalsIgnoreCase(customerInDB));
		
		// login concept
		String usernameDB = "alex12", passwordDB="a@12";
		String customerName, username, password;
		
		customerName = scan.next();
		customerName = scan.nextLine();
		username = scan.next();
		password = scan.next();
		
		System.out.println(customerName+" Login successful: "+(username.equalsIgnoreCase(usernameDB))
												+" "+(password.equals(passwordDB)));
		username = scan.next();
		password = scan.next();
		scan.close();
		System.err.println(customerName+" Login denied: "+(username.equalsIgnoreCase(usernameDB))
				+" "+(password.equals(passwordDB)));
		
		// calculator app
//		int a, b;
//		System.out.print("Enter first number: ");
//		a = scan.nextInt();
//		System.out.print("Enter first number: ");
//		b = scan.nextInt();
//		scan.close();
//		System.out.println("Addition: "+(a+b));
//		System.out.println("Subtraction: "+(a-b));
//		System.out.println("Multiplication: "+(a*b));
//		System.out.println("Division: "+(a/b));
		
		
		
		
		// Assignment: Library/Customer Registration/Login functionality/Thermostat/Sprinkler app -> use scanner concept to accept user input/condition concept
		
		
		
		
	}

}
