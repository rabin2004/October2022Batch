package javaBasics;

public class ClassOfDifferentPkg {
	
	public String msg;
//	private String errorMsg;
	String defaultMsg;
	protected String protectedMsg;
	
	public void printMsg() {
		System.out.println(msg);
	}
	
//	private void printErrorMsg() {
//		System.out.println(errorMsg);
//	}
	
	void printDefaultMsg() {
		System.out.println(defaultMsg);
	}
	
	protected void printProtectedMsg() {
		System.out.println(protectedMsg);
	}


}
