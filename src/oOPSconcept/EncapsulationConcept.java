package oOPSconcept;

public class EncapsulationConcept {
	// Encapsulation: medicine inside a capsule - data hiding
	
	// Requirement: 
			// 1. private variables - can't access outside class
			// 2. public method -> getter & setter methods -> through this method assigning/accessing value 

	private String dob; // mm/dd/yyyy
	private String ssn; // xxxxxxxxx
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	public String getDOB() {
		return dob.substring(6);
	}

	public String getSsn() {
		return ssn.substring(5);
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
