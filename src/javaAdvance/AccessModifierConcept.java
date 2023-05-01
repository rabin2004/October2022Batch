package javaAdvance;

import javaBasics.ClassOfDifferentPkg;

public class AccessModifierConcept {
	
	// Access Modifier:
		// For class properties:
			// 1. public -> can be accessed from anywhere - within the class | within the package | outside the package
			// 2. private -> can only be accessed within the class
			// 3. default -> can be accessed from - within the class | within the package | but not outside the package, even if it is a sub-class/child class
			// 4. protected -> can be accessed from - within the class | within the package | but not outside the package, unless class is a sub-class/child class 
	
			// default Vs protected -> Inheritance in OOPS concept???
	
		// For class: -> creating instance of the class
			// 1. public -> can be accessed from anywhere - same package | different package
			// 2. final -> can be accessed - same package | but not from different package
			// 3. default -> can be accessed - same package | but not from different package
			// 4. abstract -> Abstraction in OOPS concept??
	
			// final Vs default class??
	
		// final -> used for variables

	public String msg;
	private String errorMsg;
	String defaultMsg;
	protected String protectedMsg;
	
	final String finalMsg = "Final Final message";
	
	public void printMsg() {
		System.out.println(msg);
	}
	
	private void printErrorMsg() {
		System.out.println(errorMsg);
	}
	
	void printDefaultMsg() {
		System.out.println(defaultMsg);
	}
	
	protected void printProtectedMsg() {
		System.out.println(protectedMsg);
	}
	
	public static void main(String[] args) {
		// public access modifier
		AccessModifierConcept amc = new AccessModifierConcept();
		amc.msg = "public from same class";
		amc.printMsg();
		
		ClassOfSamePackage cosp = new ClassOfSamePackage();
		cosp.msg = "public same package";
		cosp.printMsg();
		
		ClassOfDifferentPkg codp = new ClassOfDifferentPkg();
		codp.msg = "public different package";
		codp.printMsg();
		
		// private access modifier
		amc.errorMsg = "private only in same class";
		amc.printErrorMsg();
//		cosp.errorMsg = "not visible from different class of same package";
//		cosp.printErrorMsg();
//		codp.errorMsg = "not visible from class of different package";
//		codp.printErrorMsg();
		
		// default access modifier
		amc.defaultMsg = "default from same class";
		amc.printDefaultMsg();
		cosp.defaultMsg = "default from same package";
		cosp.printDefaultMsg();
//		codp.defaultMsg = "default from different package not allowed";
//		codp.printDefaultMsg();
		
		// protected access modifier
		amc.protectedMsg = "protected from same class";
		amc.printProtectedMsg();
		cosp.protectedMsg = "protected from same package";
		cosp.printProtectedMsg();
//		codp.protectedMsg = "protected from different package not accessible, unless child/sub class";
//		codp.printProtectedMsg();
		
		// accessing final variable
		System.out.println(amc.finalMsg);
//		amc.finalMsg = "reassigning again"; // cannot be assigned

	}

}
