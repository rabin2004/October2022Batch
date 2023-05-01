package javaBasics;

public class OparationConcept2 {
	// Comparative operation: -> boolean output (true/false)
		// 1. equals/same -> "==" -> 10==10 - true | 10==20 - false
		// 2. not equal/same -> "!=" -> 10!=10 - false | 10!=20 - true
		// 3. more than -> ">" -> 10>20 - false | 20>10 - true
		// 4. less than -> "<" -> 10<20 - true	| 20<10 - false
		// 5. more than or equal to -> ">=" -> 20>=10 - true | 10>=10 - true | 10>=20 - false
		// 6. less than or equal to -> "<=" -> 20<=10 - false | 10<=10 - true | 10<=20 - true
	
	public static void main(String[] args) {
		int a,b;
		boolean result;
		a = 10;
		b = 20;
		
		result = a==b;
		System.out.println(result); // false
		result = a!=b;
		System.out.println(result); // true
		result = a>b;
		System.out.println(result); // false
		result = a<b;
		System.out.println(result); // true
		result = a>=b;
		System.out.println(result); // false
		result = a<=b;
		System.out.println(result); // true

		// Thermostat app
		int currentRoomTemp, desiredRoomTemp;
		desiredRoomTemp = 72;
		currentRoomTemp = 72;
		
		System.out.println("Turn on heater: "+(currentRoomTemp<desiredRoomTemp));
		System.out.println("Turn on AC: "+(currentRoomTemp>desiredRoomTemp));
		System.out.println("Do nothing: "+(currentRoomTemp==desiredRoomTemp));
		
		// comparative operator should be used for numerical dataType/primitive dataType
		String customer1, customer2; // variable creation way
		customer1 = "Alex";
		customer2 = "Alex";
		
		String customer3 = new String("Alex"); // object creation way
		
		System.out.println("Same name: "+(customer1==customer2)); // true
		System.out.println("Different name: "+(customer1!=customer2)); // false
		
//		String customer3 = "Alex";
		System.out.println("Same name: "+(customer1==customer3)); // false
		System.out.println("Different name: "+(customer1!=customer3)); // true
		
	}

}
