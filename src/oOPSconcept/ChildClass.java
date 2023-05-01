package oOPSconcept;

public class ChildClass extends ParentClass { // child/sub class inheriting/extending to parent/super class
	
	void childMethod() {
		System.out.println("Child method");
	}
	
	void commonMethod() { // super -> access parent properties
		super.commonMethod();
		System.out.println("Child class - common method");
	}

	public static void main(String[] args) {
		// parent class
		parentMethod2();
		ChildClass.parentMethod2();
		ChildClass cc = new ChildClass(); // created object/instance of the class referring to same class
		cc.parentMethod1();
		// grand parent class
		cc.grandParentMethod();
		
		// default Vs protected -> from same package
		cc.parentMethod3();
		cc.parentMethod4();
		
		// Polymorphism
		ParentClass pc = new ChildClass(); // created object/instance of the class referring to parent class
		cc.childMethod();
//		pc.childMethod(); // not allowed to access child property, but parent and higher properties can be accessed
		pc.parentMethod1();
		pc.grandParentMethod();
		
		GrandParentClass gpc = new ChildClass();
//		gpc.childMethod();
//		gpc.parentMethod1();
		gpc.grandParentMethod();
		
		// Method overriding
		cc.commonMethod();
		pc.commonMethod();
		gpc.commonMethod();
		

	}

}
