package javaAdvance;

import java.util.Scanner;

public class MethodTypes {
	// object - instance of a class, which have some properties(state & behavior)
		// method - behavior of a class/object -> function - having some implementation
		// variable - state of a class/object
		
		// instance/object of a class:
			// className refName = new className(); | new className() => class object | className() => Constructor method
	
	// Basic requirement for method:
		// 1. return type -> void (returns nothing)
		// 2. method signature -> methodName()
		// 3. method/code/implementation block -> {code}
	
	void test() { // basic method
		// code
	}
	
	// Method Types: - parameters -> like a variable defined inside method signature/method round brackets
		// 1. method without parameter - non parameterized method
		// 2. method with parameter - method parameterization
		// 3. method with multiple parameter
	
	// Method overloading ???
	
	static void methodWithoutParameter() {
		System.out.println("method without parameter");
	}
	
	static void methodWithParameter(String msg) {
		System.out.println(msg);
	}
	
	static void methodWithMultipleParameter(String op, int a, int b) {
		switch(op) {
		case "add": System.out.println(a+b); break;
		case "substract": System.out.println(a-b); break;
		case "multiply": System.out.println(a*b); break;
		case "divide": System.out.println(a/b); break;
		default: System.out.println("Not valid operation.");
		}
	}

	public static void main(String[] args) {
//		methodWithoutParameter();
//		methodWithParameter("This is method with parameter");
		Scanner scan = new Scanner(System.in);
		System.out.println("Select operation: add,substract,divide,multiply");
		String op = scan.nextLine();
		System.out.println("First value: ");
		int a = scan.nextInt();
		System.out.println("Second value: ");
		int b = scan.nextInt();
		scan.close();
		methodWithMultipleParameter(op,a,b);
	}
	
	// Assignment:
		// 1. BMI/Temperature conversion/Weight conversion/Currency conversion
		// 2. Library/Customer Registration/Login functionality/Thermostat/Sprinkler app
		// 3. Use object/method/variable concept - variable types/method types/static Vs non-static when applicable


}
