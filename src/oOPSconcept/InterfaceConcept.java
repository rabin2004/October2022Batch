package oOPSconcept;

public interface InterfaceConcept {
	// Interface: -> 
		// 1. different java file other than class
		// 2. all methods defined will be default abstract
		// 3. Interface can only be implemented by class -> inheritance between interface & class - "implements"
		// 4. Multiple inheritance can be achieved between interfaces and class
		

	void login();
	void search();
	void cart();
	void checkout();
	void payment();
	abstract void registration(); // no need abstract keyword
}
