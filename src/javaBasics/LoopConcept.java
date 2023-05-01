package javaBasics;

public class LoopConcept {
	
	// Loop -> if action/code/logic needs to performed/executed numerous time
	
	// 3 requirements needed: 1. counter variable(Starting point) 2. condition(repeat until stop point) 3. increment/decrement (direction/pattern)
	
	// Types of loops:
	// 1. for(1;2;3){code/logic/action}
	// 2. while -> 1; while(2){code/logic/action; 3;}

	public static void main(String[] args) {
		// 1-100 -> System.out.println(1); ..... int a =1; System.out.println(a); ......
//		for(int i=1; i<=100; i=i+1) {
//			System.out.println(i);
//		}
		
//		int i = 1;
//		while(i<=100) {
//			System.out.println(i);
//			i = i+1;
//		}
		
		// 5-1000
//		for(int i=5; i<=1000; i++) { // i++ => i=i+1
//			System.out.println(i);
//		}
		
		// 10-1
//		for(int i=10; i>=1; i=i-1) {
//			System.out.println(i);
//		}
		
//		int i=10;
//		while(i>=1) {
//			System.out.println(i);
//			i--; // i-- => i=i-1
//		}
		
		// 1-100 all even numbers
		for(int i=2; i<=100; i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// 1-100 all odd numbers
		int j = 1;
		while(j<=100) {
			System.out.print(j+" ");
			j=j+2;
		}
		
		// Assignment: 	1. Try for & while loop -> odd/even numbers 
					//	2. Switch concept -> a. Library/Member Login functionality/Selecting book category to complete order 
										  // b. Library/Selecting book category to complete order/to complete order, login should happen

	}

}
