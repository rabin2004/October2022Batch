package javaAdvance;

public class VariableTypes {
	
	// object - instance of a class, which have some properties(state & behavior)
	// method - behavior of a class/object -> function - having some implementation
	// variable - state of a class/object
	
	// instance/object of a class:
		// className refName = new className();
	
	
	// Types of variable: -> where & how
		// 1. Instance variable/Non-static variable: -> variable is defined inside the class but outside any method, non-static in nature - no static keyword
		// 2. Class variable/Static variable: -> variable is defined inside the class but outside any method, static in nature - static keyword
		// 3. Local variable: -> variable inside a method, will be only visible inside the method
	
	boolean result1 = true; //value assigned Instance variable
	boolean result2; // Instance variable without value assigned
	
	static int a = 100; // Class variable with value assigned
	static int b; // class variable without value assigned
	
	
	// Static Vs Non-static:
		// static: more close to class, multiple way to access it
			// 1. direct access
			// 2. Using className
			// 3. Using object/instance reference name -> but not a preferred way to access static property
		// Non-static: only way to access them
			// 1. Using object/instance reference name
	
	// Static & Non-static mismatch:
		// access static property -> can be easily access through both static or non-static method
		// access non-static property -> from non-static method -> property type match, can be accessed directly
		// access non-static property -> from static method -> follow non-static way of accessing it
	
	static void printOut() { // static method
		String msg = "App is not available at this moment"; // local variable
		System.err.println(msg);
		
		// accessing non-static property from static method
		VariableTypes vt = new VariableTypes();
		System.out.println(vt.result1);
		vt.result2 = true;
		System.out.println(vt.result2);
		
		// accessing static property
		// 1. direct calling
		System.out.println(a);
		b = 200;
		System.out.println(a+b);
		// 2. Using className
		System.out.println(VariableTypes.a);
		VariableTypes.b = 200;
		System.out.println(VariableTypes.a+VariableTypes.b);
		// 3. Using object reference name - The static field VariableTypes.a should be accessed in a static way
//		System.out.println(vt.a);
//		vt.b = 200;
//		System.out.println(vt.a+vt.b);
	}
	
	void printingResult() { // non-static method
		// accessing non-static property from non-static method
		System.out.println(result1);
		result2 = true;
		System.out.println(result2);
		
		// accessing static property
		// 1. direct calling
		System.out.println(a);
		b = 200;
		System.out.println(a + b);
		// 2. Using className
		System.out.println(VariableTypes.a);
		VariableTypes.b = 200;
		System.out.println(VariableTypes.a + VariableTypes.b);
		// 3. Using object reference name - The static field VariableTypes.a should be
		// accessed in a static way
//		VariableTypes vt = new VariableTypes();
//		System.out.println(vt.a);
//		vt.b = 200;
//		System.out.println(vt.a + vt.b);
		
	}

	public static void main(String[] args) {
//		System.out.println(msg); // msg cannot be resolved to a variable
		String msg = "App is not available at this moment"; // local variable
		System.err.println(msg);

	}

}
