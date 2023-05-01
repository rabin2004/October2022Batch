package javaAdvance;

import java.util.Scanner;

public class ConstructorConceptMethodOverloadingAndReturnType {
	
	// Constructor Concept: -> constructor method
		// Constructor -> 	1. special method that carries name of the class
						//	2. no need to call separately, will be automatically called as soon as instance/object of the class is created
						//	3. no return type
						//	4. constructor overloading can happen
						//	5. assigning value to instance/non-static variable
						//	6. if constructor method is not created, default constructor method will be created as soon as instance/object of a class is created
	
	String msg; // instance/non-static variable
	
	// Constructor overloading
	ConstructorConceptMethodOverloadingAndReturnType() { // non-parameterized constructor
		System.out.println("I'm in constructor");
	}
	
	ConstructorConceptMethodOverloadingAndReturnType(String a){ // parameterized constructor
		msg = a;
		System.out.println(msg);
	}
	
	ConstructorConceptMethodOverloadingAndReturnType(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	// Method Overloading -> having multiple with same name but different signature
		// duplicate method - not allowed
	
	int a;
	int b;
	
	void add() {
		System.out.println("Result: "+(a+b));
	}
	
	void add(int c) {
		System.out.println("Result: "+(a+b+c));
	}
	
	void add(int c, int d) {
		System.out.println("Result: "+(a+b+c+d));
	}
	
	// return type
	int substract() {
		int c = a-b;
		return c;
	}
	
	int substract(int c) {
//		a-b-c;
		return substract()-c;
	}
	
	int substract(int c, int d) {
		return substract(c)-d;
	}

	public static void main(String[] args) {
		// instance created with non-parameterized constructor
		ConstructorConceptMethodOverloadingAndReturnType cc = 
				new ConstructorConceptMethodOverloadingAndReturnType();
		cc.msg ="using non-parameterized constructor";
		System.out.println(cc.msg);
		
		// instance created with parameterized constructor
		ConstructorConceptMethodOverloadingAndReturnType cc1 = 
				new ConstructorConceptMethodOverloadingAndReturnType("I'm in the parameterized constructor");
		System.out.println("Called instance variable again: "+cc1.msg);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("First value: ");
		int a = scan.nextInt();
		System.out.println("Second value: ");
		int b = scan.nextInt();
		
		ConstructorConceptMethodOverloadingAndReturnType cc2 = 
				new ConstructorConceptMethodOverloadingAndReturnType(a,b);
		cc2.add();
		
		System.out.println("Third value: ");
		int c = scan.nextInt();
		
		cc2.add(c);
		
		System.out.println("Fourth value: ");
		int d = scan.nextInt();
		
		cc2.add(c, d);
		
		int result = cc2.substract(c, d);
		System.out.println("Result: "+result);
		
		scan.close();
	}

}
