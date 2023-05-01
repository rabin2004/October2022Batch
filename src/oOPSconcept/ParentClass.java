package oOPSconcept;

public class ParentClass extends GrandParentClass {
	
	public void parentMethod1() {
		System.out.println("Parent Method-1");
	}
	
	public static void parentMethod2() {
		System.out.println("Parent Method-2");
	}
	
	void parentMethod3() {
		System.out.println("Parent Method-defualt");
	}
	
	protected void parentMethod4() {
		System.out.println("Parent Method-protected");
	}
	
	protected static void parentMethod5() {
		System.out.println("Parent Method-protected");
	}
	
	void commonMethod() {
		super.commonMethod();
		System.out.println("Parent class - common method");
	}

	public static void main(String[] args) {
		

	}

}
