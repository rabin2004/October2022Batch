package javaBasics;

public class StringHelperClassStringBufferAndBuilder {
	// StringBuffer & StringBuffer -> String helper classes

	public static void main(String[] args) {
		
		String msg = "Hello String helper class!!";
		
//		String updatedMsg = msg.replace("String", "");
//		System.out.println(updatedMsg);
		
		StringBuffer sb = new StringBuffer(msg);
//		sb.delete(msg.indexOf('S'), msg.indexOf('g')+1);
//		System.out.println(sb);
		
//		StringBuilder sbu = new StringBuilder(msg);
//		sbu.delete(msg.indexOf('S'), msg.indexOf('g')+1);
//		System.out.println(sbu);
		
		sb.insert(msg.length()-1, "!");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
