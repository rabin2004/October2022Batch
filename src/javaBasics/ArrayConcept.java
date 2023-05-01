package javaBasics;

import java.util.Scanner;

public class ArrayConcept {
	// Array -> create data table - store multiple values/data
	
	// 1 Dimensional Array: 1D array -> 1 Column with multiple rows
	// 2 Dimensional Array: 2D array -> multiple columns with multiple rows
	
	// Creating: 1. DataType 2. reference name 3. size of array

	public static void main(String[] args) {
		// Creating 1 D array:
		// #1 way of creating:
//		int[] a = new int[5];
		// inserting data into array
//		a[0] = 10; // 1st row
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		a[5] = 60; // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// extract data from array
//		System.out.println("Data in 3rd row: "+a[2]);
//		System.out.println("Data in 5th row: "+a[4]);
		// number of rows
//		int rowCount = a.length;
//		System.out.println("Number of rows: "+rowCount);
		// extracting all data
//		for(int i=0; i<rowCount; i++) {
//			System.out.println(a[i]);
//		}
//		int j=rowCount-1;
//		while(j>=0) {
//			System.out.println(a[j]);
//			j--;
//		}
		
		// #1 way of creating 1D array
//		String customerName[] = new String[4];
		// #2 way of creating 1D array
//		String customerName[] = {"Alex","Brian","Anthony","Maria","Jack"};
//		System.out.println("Number of rows: "+customerName.length);
//		Scanner scan = new Scanner(System.in);
//		String customerEnteringBuilding = scan.nextLine();
//		scan.close();
//		for(int i=0; i<=customerName.length;i++) {
//			System.out.println(customerName[i].toUpperCase());
//			if(customerName[i].equalsIgnoreCase(customerEnteringBuilding)) {
//				System.out.println("Access granted");
//			}else {
//				System.out.println("Access denied");
//			}
//		}
		
		// 2D array
		// #1 way of creating 2D array
//		int[][] a = new int[3][4];
		// 1st row
//		a[0][0] = 10;
//		a[0][1] = 20;
//		a[0][2] = 30;
//		a[0][3] = 40;
		// 2nd row
//		a[1][0] = 50;
//		a[1][1] = 60;
//		a[1][2] = 70;
//		a[1][3] = 80;
		// 3rd row
//		a[2][0] = 90;
//		a[2][1] = 100;
//		a[2][2] = 110;
//		a[2][3] = 120;
		
//		System.out.println("2nd row, 3rd column: "+a[1][2]);
		
		// #2 way of creating 2D array
//		int[][] b = {	{10,20,30,40},
//						{50,60,70,80},
//						{90,100,110,120},
//						{130,140,150,160}};
//		System.out.println("2nd row, 3rd column: "+b[1][2]);
//		int rowCount = b.length;
//		System.out.println("Number of rows: "+rowCount);
//		int columnCount = b[0].length;
//		System.out.println("Number of columns: "+columnCount);
		
		// traversing through 2D array
//		for(int i=0; i<b.length; i++) { // traversing through rows
//			for(int j=0; j<b[i].length; j++) { // traversing through column
//				System.out.println(b[i][j]);
//			}
//		}
		
//		for(int i=0; i<b.length; i++) { // traversing through rows
//			for(int j=0; j<b[i].length; j++) { // traversing through column
//				System.out.print(b[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		// String manipulation: split()
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String customerName = scan.nextLine();
		scan.close();
		String[] cusName = customerName.split(" ");
//		System.out.println("First name: "+cusName[0]);
//		System.out.println("Last name: "+cusName[1]);
		String cusIntitial = "";
		for(int i=0; i<cusName.length; i++) {
//			System.out.print(cusName[i].charAt(0));
			cusIntitial = cusIntitial+String.valueOf(cusName[i].charAt(0));
		}
		System.out.println("Customer Initial: "+cusIntitial);
		

	}

}
