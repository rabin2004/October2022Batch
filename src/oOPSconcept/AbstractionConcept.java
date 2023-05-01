package oOPSconcept;

public abstract class AbstractionConcept {
	
	// Abstraction: -> hiding functionalities and only showing that can be accessed/used
		// Abstract method -> method without implementation block, abstract keyword - class needs to be abstract
		// Abstract class -> can handle abstract method as well as regular method, not allowed to created object/instance, accessing/implementing is by inheritance
	
	// login/registration/search/cart/checkout/payment - functionality
	
	// Basic requirement for method:
	// 1. return type -> void (returns nothing)
	// 2. method signature -> methodName()
	// 3. method/code/implementation block -> {code}
	
	abstract void login();
	abstract void search();
	abstract void cart();
	abstract void checkout();
	abstract void payment();
	
	static void registration() {
		System.out.println("Registration completed.");
	}

	public static void main(String[] args) {
//		AbstractionConcept ac = new AbstractionConcept();
//		ac.login();

		registration();
		
		
	// accessing interfaces-classes combo
		InterfaceAbstractionConcept iac = new InterfaceAbstractionConcept();
		iac.registration();
		iac.login();
		iac.rentAppliance();
		iac.search();
		iac.cart();
		iac.checkout();
		iac.payment();
		iac.accountInfo();
		iac.cancelAccount();
	
	}

}
