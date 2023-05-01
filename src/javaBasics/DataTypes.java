package javaBasics;

public class DataTypes {
	
	// Data Types:
			// 1. Primitive Data Type: pre-defined data type
					// Numerical Data Type
						// Whole Numbers:
							// byte: smallest, +/-
							// short: bigger than byte, +/-
							// int (integer): bigger than short, +/-
							// long: biggest, +/-, "l" or "L"
		
						// Decimals:
							// float: small, +/-, "f" or "F"
							// double: big, +/-, "d" or "D"
		
					// Non Numerical Data Type
						// boolean: true or false -> condition concept
						// char (character): single alphabetic or numerical character inside single quote 'a'/'A'/'3'
			
			// 2. Class/Object reference Data Type: not pre-defined data type, separate class it is referring
					// String: anything inside double quotation, can be alphabetic or numerical or special character or blank spaces or combination

	// Creating Variables: -> creating mechanism to create data to use in the application
		// Requirement to create variables: 1. Data types	2. Reference Name	3. Data/Value assigned
	
	public static void main(String[] args) {
		// Creating variables
		byte byteData = 11;
		System.out.println("Print byte data: "+byteData); // + -> place operator
		short shortData = 1200;
		System.out.println(shortData);
		int integerData = 12000;
		System.out.println(integerData);
		long longData = 120000L; // l or L
		// if reference of variable is not called -> show warning saying unused
		System.out.println(longData);
		
//		int a = 10.55; // variable mismatch
		
		float floatData; // creating variable without data assigned/initialized
//		System.out.println(floatData); // not allowed to call variable reference name without assigning value/data
		floatData = 10.55F; // f or F -> assigned value to variable created earlier
		System.out.println(floatData);
		
		double doubleData1, doubleData2; // creating multiple variable of same data type
		doubleData1 = 2.55555d; // d or D
		doubleData2 = 4.77777D;
		System.out.println(doubleData1+doubleData2); // + -> additional operation
		
//		int doubleData1; // duplicate variable
		doubleData1 = 2.5; // re-assigning value
		doubleData2 = 6.5;
		System.out.println(doubleData1+" "+doubleData2); // + -> place operator
		System.out.println(doubleData1*doubleData2);
		
		boolean positiveBoolean, negativeBoolean;
		positiveBoolean = true;
		negativeBoolean = false;
		System.out.println("Sun rises in east? "+positiveBoolean);
		System.out.println("Sun rises in west? "+negativeBoolean);
		
		char characterData1, characterData2, characterData3;
		characterData1 = 'a';
		characterData2 = 'X';
		characterData3 = '9';
		System.out.println(characterData1+"\t"+characterData2+"\t"+characterData3);
		
		// #1 way of creating String variable
		String stringData = "Hello Java 1243432423 *^(*&^&*%^%^&   kldsgnklsdgnlkdsgn";
		System.out.println(stringData);
		
		// #2 way of creating String variable -> Object creation (Creating object of String class)
		String stringData2 = new String("Learning data type concept");
		System.out.println(stringData2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
