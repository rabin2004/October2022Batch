package javaBasics;

public class StringManipulationConcept2 {

	public static void main(String[] args) {
		String cusName = "    Tom     Jerry     ";
		
		
		// trim() -> remove blank spaces from front and back
		System.out.println("Welcome back "+cusName.toUpperCase()+"!");
		System.out.println(cusName.length());
		cusName = cusName.trim();
		System.out.println("Welcome back "+cusName.toUpperCase()+"!");
		System.out.println(cusName.length());
		
		// subString(beginingIndex) -> capture section of a string
		// subString(beginingIndex, endIndex)
		String customer = "David Beckham";
		String welcomeMsg = "Welcome back to Amazon "+customer+"!";
		String welcomeMsgSection1 = welcomeMsg.substring(11);
		System.out.println(welcomeMsgSection1);
		System.out.println("Customer name: "+welcomeMsg.substring(23));
		
		System.out.println("Customer name: "+welcomeMsg.substring(23, welcomeMsg.length()-1));
		
		// isEmpty() -> only if length is 0 => true | isBlank() -> as long as there is no character or just white space =>true -> validation method
		cusName = "";
		System.out.println(cusName.length());
		System.out.println("Is customer name blank? "+cusName.isBlank());
		System.out.println("Is customer name empty? "+cusName.isEmpty());
		System.out.println("Welcome back to Amazon "+cusName+"!");
		cusName = "    ";
		System.out.println(cusName.length());
		System.out.println("Is customer name blank? "+cusName.isBlank());
		System.out.println("Is customer name empty? "+cusName.isEmpty());
		System.out.println("Welcome back to Amazon "+cusName+"!");
		
		// replace()
		System.out.println(welcomeMsg.replace("A", "a"));
		System.out.println(welcomeMsg.replace("Amazon", "AMAZON"));
		System.out.println(welcomeMsg.replace(" to Amazon", ""));
		// replaceAll()
		System.out.println(welcomeMsg.replaceAll("o", "O"));
		System.out.println(welcomeMsg.replaceAll(" ", "_"));
		
		// contains() -> to check character sequence
		System.out.println(welcomeMsg.contains("Welcome back to Amazon"));
		System.out.println(welcomeMsg.contains("amazon"));
		
		// concat() -> concatenate strings together
		String firstName, lastName;
		firstName = "David";
		lastName = "Beckham";
		System.out.println("Welcome back to Amazon "+firstName+" "+lastName+"!");
		cusName = firstName.concat(" ".concat(lastName));
		System.out.println("Welcome back to Amazon "+cusName+"!");
		
		// split() ---- ?
		
	}

}
