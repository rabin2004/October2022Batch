package oOPSconcept;

public class AbstractImplementationConcept extends AbstractionConcept {
	
	// Extending Abstract class:
		// 1. implement all abstract method - implementing will default override abstract method
		// 2. if not implement at all or not all methods - this class needs to be abstract

	public static void main(String[] args) {
		

	}

	@Override
	void login() {
		System.out.println("Login successful");
	}

	@Override
	void search() {
		System.out.println("Search successful");
	}

	@Override
	void cart() {
		System.out.println("Cart successful");
	}

	@Override
	void checkout() {
		System.out.println("Checkout successful");
	}

	@Override
	void payment() {
		System.out.println("Payment successful");
	}

}
