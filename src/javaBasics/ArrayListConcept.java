package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	// ArrayList: ArrayList class - 1 column

	public static void main(String[] args) {
		// create ArrayList - creating object/instance of the class
//		ArrayList al = new ArrayList(); //  raw type/non-parameterized
		// add() -> insert value
//		al.add("String");
//		al.add(100);
//		al.add(true);
		
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		ArrayList<Double> al2 = new ArrayList<Double>();
		
		ArrayList<String> al = new ArrayList<String>(); // parameterized
		al.add("Danny");
		al.add("Mark");
		al.add("John");
//		al.add(100); // is not applicable for the arguments
		
		System.out.println(al);
		
		// insert data in a specific row
		al.add(1, "Max");
		
		System.out.println(al);
		System.out.println("Number of rows: "+al.size());
		
		// remove data
		al.remove(2);
		System.out.println(al); // quick pick of data
		
		// size() -> number of rows
		System.out.println("Number of rows: "+al.size());
		
		// extract data
		System.out.println(al.get(0));
		
		al.add("Mary");
		al.add("Mark");
		System.out.println(al);
		System.out.println("Number of rows: "+al.size());
		
		// contains() -> check if data is present, boolean output
		System.out.println(al.contains("John"));
		
		// indexOf() -> index of a data provided
		System.out.println("Index of row where Mark is present: "+al.indexOf("Mark"));
		System.out.println("Position of row where Mark is present: "+(al.indexOf("Mark")+1));
		
		// isEmpty() -> if any value/row present
		System.out.println("Is ArrayList empty? "+al.isEmpty());
		
		// clear() -> removes all data
//		al.clear();
//		System.out.println(al);
//		System.out.println("Is ArrayList empty? "+al.isEmpty());
		
		// clone() -> create copy/instance
//		Object alClone = al.clone();
		
		// equals() -> 2 arrayList are same or not, content sensitive
//		System.out.println("ArrayList and clone of it is same or not? "+al.equals(alClone));
//		al.clear();
//		System.out.println("ArrayList and clone of it is same or not? "+al.equals(alClone));
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Danny");
		al2.add("Max");
		al2.add("John");
		al2.add("Mary");
		al2.add("Mark");
//		al2.add("mark"); // case sensitive
//		al2.add("Max"); // location sensitive
		System.out.println("2 ArrayList are same or not? "+al.equals(al2));
		
//		al2.add("Danny");
//		al2.add(3, "Danny");
//		System.out.println(al2);
		
//		System.out.println(al2.indexOf("Danny")); // 1st occurrence
		// for more occurrence - need to build logic
//		System.out.println(al2.lastIndexOf("Danny")); // last occurrence
		
		// Traversing ArrayList
		// 1. for loop
		for(int i=0; i<al2.size(); i++) {
			System.out.print(al2.get(i)+" | ");
		}
		System.out.println();
		
		// 2. while loop
		int i=al2.size()-1;
		while(i>=0) {
			System.out.print(al2.get(i)+" | ");
			i--;
		}
		
		System.out.println();
		// 3. for each loop
		for(String cusName: al2) {
			System.out.print(cusName+" | ");
		}
		System.out.println();
		
		// 4. Iterator concept
		Iterator<String> it = al2.iterator();
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("1st row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("2nd row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("3rd row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("4th row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext());
//		System.out.println("5th row value: "+it.next());
//		System.out.println("Is there next row? "+it.hasNext()); // no more rows left
//		System.out.println("5th row value: "+it.next()); // NoSuchElementException
		while(it.hasNext()) {
			System.out.print(it.next()+" | ");
		}
		
		System.out.println();
		
		// Using array & arrayList together -
		String[] customer_1_Info = {"Mark", "1234567689", "mk@gmail.com"};
		String[] customer_2_Info = {"Jack", "2345676890", "jm@gmail.com"};
		
		ArrayList<String[]> customers = new ArrayList<String[]>();
		customers.add(customer_1_Info);
		customers.add(customer_2_Info);
		
		for(String[] a: customers) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		
	}
	
	// Assignment:
		// 1. Identify more occurrence & row where it is present - need to build logic -> use all 4 traversing technique
		// 2. Library application -> Each book details is in array -> Every book category is in ArrayList -> Get all info of book based on customer selection

}
