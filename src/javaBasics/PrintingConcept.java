package javaBasics;

public class PrintingConcept {

	public static void main(String[] args) {
		// println() -> print in a line push cursor to next line, rest of the code/output will be pushed in another line
		System.out.println("Hello java again!!");
		System.out.println(); // empty println()
		System.out.println("Learning Printing concept");
		
		// print() -> print, cursor will stay in same line
		System.out.print("Learning QA!");
		System.out.print("Automation section!");
//		System.out.print(); // print() can't be empty
		
		// Shortcut -> sysout -> ctrl+spaceBar
		System.out.println("Shortcut");
		System.out.println("Shortcut used");
		
		// long statement or paragraph
		System.out.println("print in a line push cursor to next line, rest of the code/output "
				+ "will be pushed in another line");
		
		// word wrap code
		System.out.println("print in a line push cursor to next line, rest of the code/output "
				+ "will be pushed in another line. print in a line push cursor to next line, "
				+ "rest of the code/output will be pushed in another line. print in a line push "
				+ "cursor to next line, rest of the code/output will be pushed in another line");
		
		System.out.println();
		
		// word wrap output
		System.out.println("print in a line push cursor to next line, "+"\n"+"rest of the "
				+ "code/output will be pushed in another line. "+"\n"+"print in a line push "
						+ "cursor to next line, "+"\n"+"rest of the code/output will be pushed in "
								+ "another line. "+"\n"+"print in a line push cursor to next line"
										+ ", "+"\n"+"rest of the code/output will be pushed in "
												+ "another line");
		System.out.println();
		
		// using tab space
		System.out.println("Name "+" Email Address "+" Telephone "+" Address");
		System.out.println("Mike "+" mike@gmail.com "+" 123456789 "+" 123 New plaza");
		System.out.println("Derrick M. "+" derrickM@gmail.com "+" 1234567890 "+" 321 New plaza "
				+ "7th floor");
		
		System.out.println();
		
		System.out.println("Name"+"\t\t"+"Email Address"+"\t\t"+"Telephone"+"\t\t"+"Address");
		System.out.println("----------------------------------------------"
				+ "----------------------------");
		System.out.println("Mike"+"\t\t"+"mike@gmail.com"+"\t\t"+"123456789"+"\t\t"+"123 New plaza");
		System.out.println("Derrick M."+"\t"+"derrickM@gmail.com"+"\t"+"1234567890"+"\t\t"+
		"321 New plaza 7th floor");
		
		// error printing
		System.err.println("Try again!!");
	}

}
