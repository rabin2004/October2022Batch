package javaAdvance;

import java.util.Scanner;

public class CalculatorApp {
	static Scanner scan = new Scanner(System.in);
	static Calculation cal = new Calculation(); // object/instance of a class
	
//	public void calculation(int a, int b) {
//		cal.add(a, b);
//		cal.substract(a, b);
//	}
	
	public void calculation() {
		cal.add(); // non static method
//		cal.substract(); // static method
//		substract(); // The method substract() is undefined for the type CalculatorApp
		Calculation.substract();
	}
	
	

	public static void main(String[] args) {
		System.out.print("Enter first value: ");
		cal.a = scan.nextInt();
		System.out.print("Enter second value: ");
		Calculation.b = scan.nextInt();
		scan.close();
		
		CalculatorApp ca = new CalculatorApp();
		ca.calculation();

	}

}
