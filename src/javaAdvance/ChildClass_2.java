package javaAdvance;

import oOPSconcept.ChildClass;
import oOPSconcept.ParentClass;

public class ChildClass_2 extends ParentClass {

	public static void main(String[] args) {
		// parent class
		parentMethod2();
		ChildClass.parentMethod2();
		ChildClass cc = new ChildClass();
		cc.parentMethod1();
		// grand parent class
		cc.grandParentMethod();
		
		// default Vs protected -> from same package
//		cc.parentMethod3();
//		cc.parentMethod4(); // protected method being flagged ????
		parentMethod5();
	

	}

}
