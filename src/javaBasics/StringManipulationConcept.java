package javaBasics;

public class StringManipulationConcept {
	// Using various methods defined in String class

	public static void main(String[] args) {
		String customer1, customer2; // variable creation way
		customer1 = "Alex";
		customer2 = "Alex";
		
		String customer3 = new String("Alex"); // object creation way
		
//		System.out.println("Same name: "+(customer1==customer2)); // true
//		System.out.println("Different name: "+(customer1!=customer2)); // false

//		System.out.println("Same name: "+(customer1==customer3)); // false
//		System.out.println("Different name: "+(customer1!=customer3)); // true
		
	// Comparison between String value
		// equals() -> boolean output, case sensitive
		System.out.println("Same name: "+customer1.equals(customer2));
		System.out.println("Same name: "+customer1.equals(customer3));
		System.out.println("Same name: "+customer2.equals(customer3));
		customer2 = "alex";
		System.out.println("Same name with same casing: "+customer1.equals(customer2));
		// equalsIgnoreCase() -> boolean output, case insensitive
		System.out.println("Same name, disregard casing: "+customer1.equalsIgnoreCase(customer2));
		
		// compareTo() -> integer output, 0 -> same | non-zero -> different | case sensitive
		System.out.println("Same name: "+customer1.compareTo(customer3));
		System.out.println("Same name with different casing: "+customer1.compareTo(customer2));
		
		// compareToIgnoreCase() -> integer output, 0 -> same | non-zero -> different | case insensitive
		System.out.println("Same name: "+customer1.compareToIgnoreCase(customer3));
		System.out.println("Same name, disregard casing: "+customer1.compareToIgnoreCase(customer2));
		
	// length() -> size/number of characters of String	
		customer1 = "Welcome Alex Gong!!!!";
		System.out.println(customer1.length());
		
	// Changing casing of the String	
		System.out.println(customer1.toUpperCase());
		System.out.println(customer1.toLowerCase());
		
	// index of character/characterSequence	-> index(starts from 0) Vs position(starts from 1) -> index=position-1 | position=index+1
		System.out.println("Index of character c: "+customer1.indexOf('c')); // output: -1 -> value not present
		System.out.println("Position of character c: "+(customer1.indexOf('c')+1));
		System.out.println("Index of word Alex: "+customer1.indexOf("Alex"));
		System.out.println("Position of word Alex: "+(customer1.indexOf("Alex")+1));
		
		// Multiple occurrence
		customer1 = "Welcome Alex Gong for being member of the club!!!!";
		System.out.println("1st occurrence of e: "+ customer1.indexOf('e'));
		System.out.println("Last occurrence of e: "+customer1.lastIndexOf('e'));
		System.out.println("Second occurrence of e: "+customer1.indexOf('e', 2));
		System.out.println("Second occurrence of e: "+customer1.indexOf('e', customer1.indexOf('e')+1));
		System.out.println("Third occurrence of e: "+ customer1.indexOf('e', 7));
		System.out.println("Third occurrence of e: "+ customer1.indexOf('e', 
				customer1.indexOf('e', customer1.indexOf('e')+1)+1));
		System.out.println("Fourth occurrence of e: "+ customer1.indexOf('e', customer1.indexOf('e', 
				customer1.indexOf('e', customer1.indexOf('e')+1)+1)+1));
		
		// charAt() -> character at position
		System.out.println("Character at 24th position/23rd index: "+customer1.charAt(23));
		System.out.println("Character at 11th position/10th index: "+customer1.charAt(10));
	}
	
	// Assignment: Library/Customer Registration/Login functionality/Thermostat/Sprinkler app

}
