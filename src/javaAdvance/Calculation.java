package javaAdvance;

public class Calculation {
	int a; // instance/non-static variable
	static int b; // class/static variable
	
//	public void add(int a, int b) {
//		System.out.println("Addition result: "+(a+b));
//	}
	
	public void add() { // non-static method
		System.out.println("Addition result: "+(a+b));
	}
	
//	public void substract(int a, int b) {
//		System.out.println("Substraction result: "+(a-b));
//	}
	
	public static void substract() { // static method
		Calculation cal = new Calculation();
		System.out.println("Substraction result: "+(cal.a-Calculation.b));
	}

}
