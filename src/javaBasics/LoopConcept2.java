package javaBasics;

import java.util.Scanner;

public class LoopConcept2 {

	public static void main(String[] args) {
		// Reversing string without using String helper classes
		Scanner scan = new Scanner(System.in);
		String stringToBeReversed = scan.nextLine(); // apple -> elppa
		scan.close();
//		for(int i=stringToBeReversed.length()-1; i>=0; i--) {
//			System.out.print(stringToBeReversed.charAt(i));
//		}
		
		String reversedString = "";
		for(int i=stringToBeReversed.length()-1; i>=0; i--) {
			reversedString = reversedString+String.valueOf(stringToBeReversed.charAt(i));
		}
		System.out.println(reversedString.toUpperCase());
	}
	
	// Assignment: 
		// 1: Reverse string but only reverse if String is a valid string
		// 2. Identify if the number provided by user/customer is even or odd -> modulus: %
		// 3. Use loop concept to create login functionality that will allow 3 invalid try after which account get locked -> counter for number of invalid try
		// 4. Library/Member Login functionality/Selecting book category -> Loop concept/1D or 2D array

}
