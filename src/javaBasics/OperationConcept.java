package javaBasics;

public class OperationConcept {
	// Data operation: 1. Arithmetic(mathematical) Operation | 2. Comparative Operation
	
	// Arithmetic(mathematical) Operation -> +,-,*,/

	public static void main(String[] args) {
		int a,b;
		a = 10;
		b = 15;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 0.2 -> 0 -> this not rounding up
		System.out.println(b/a); // 1.5
		
//		float a,b;
//		a = 10;
//		b = 15;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b); // 0.6666667
		
//		double a,b,c;
//		a = 10;
//		b = 15;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b); // 0.6666666666666666
//		
//		c = a+b;
//		System.out.println(c);
//		c = a-b;
//		System.out.println(c);
//		c = a*b;
//		System.out.println(c);
//		c = a/b;
//		System.out.println(c);
		
		// Distance
		double km, miles;
//		km = 99;
//		miles = km*1.6;
//		System.out.println(km+"km distance is "+miles+" miles.");
		miles = 153;
		km = miles/1.6;
		System.out.println(miles+"miles distance is "+km+" km.");
		
		// Temp conversion
		double celsius, farenheit;
		farenheit = 80;
		celsius = (farenheit-32)*5/9;
		System.out.println(celsius);
		celsius = 32;
		farenheit = (celsius*9/5)+32;
		System.out.println(farenheit);
		
	}
	
	// Assignment_2: BMI/Temperature conversion/Weight conversion/Currency conversion

}
