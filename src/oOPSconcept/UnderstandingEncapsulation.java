package oOPSconcept;

import java.util.*;

public class UnderstandingEncapsulation {
	static EncapsulationConcept ec = new EncapsulationConcept();
	
	void displayCustomerDetails(String ssn, String dob) {
		System.out.println("Please validate following details: ");
		System.out.println("Last 4 SSN: *****"+ssn);
		System.out.println("Birth Year: "+dob);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Details: ");
		System.out.print("SSN: ");
		ec.setSsn(scan.nextLine());
		System.out.print("DOB (MM/DD/YYYY): ");
		ec.setDOB(scan.nextLine());
		scan.close();
		
		UnderstandingEncapsulation ue = new UnderstandingEncapsulation();
		ue.displayCustomerDetails(ec.getSsn(), ec.getDOB());

	}

}
