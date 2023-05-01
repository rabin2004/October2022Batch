package oOPSconcept;

public abstract class InterfaceImplementationUnderstanding implements InterfaceConcept, InterfaceConcept2 {
	// Implementing Interface:
				// 1. implement all default abstract method - implementing will default override abstract method, method overriding should be 
				// 2. if not implement at all or not all methods - this class needs to be abstract

	@Override
	public void login() {
		System.out.println("Login successful");
	}

	@Override
	public void search() {
		System.out.println("Search successful");
	}

	@Override
	public void cart() {
		System.out.println("Cart successful");
	}

	@Override
	public void checkout() {
		System.out.println("Checkout successful");
	}

	@Override
	public void payment() {
		System.out.println("Payment successful");
	}
	
	@Override
	public void registration() {
		System.out.println("Payment successful");
	}
	

}
