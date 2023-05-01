package javaAdvance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryLogic {
	
	static String[][] bookDB() {
		String[][] db= {{"test book 1", "test author", "fiction"},
						{"test book 2", "test author", "fiction"},
						{"test book 3", "test author", "Non-fiction"},
						{"test book 3", "test author 1", "Non-fiction"},
						{"test book 3", "test author 2", "Non-fiction"}};
		return db;
	}
	
	static void searchBy(String[][] a, String b) {
		List<String[]> info = Arrays.asList(a);
		System.out.println("Available books info: ");
		System.out.println("-----------------------");
		for(String[] wholeList: info ) {
			List<String> eachList = Arrays.asList(wholeList);
			if(eachList.contains(b)) {
				System.out.println(eachList);
			}
			else{
				int lastRowCheck = eachList.indexOf(b);
				if(lastRowCheck==-1){
					break;
				}
			}
		}
	}
	
	static void searchBooksByBookName(String[][] a, String b) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j].equalsIgnoreCase(b)) {
					String[] bookInfo = a[i];
					for(String info: bookInfo) {
						System.out.print(info+"|");
					}
					break;
				}
				System.out.println();
			}
		}
	}
	
	static ArrayList<String> getAuthorNameList(String[][] a) {
		ArrayList<String> b = new ArrayList<String>(); 
		for(int i=0; i<a.length; i++) {
			String author = a[i][1];
			b.add(author);
		}
		return b;
	}
	
	static Set<String> availableAuthor(ArrayList<String> a) {
		Set<String> authSet = new HashSet<String>();
		for(String x: a) {
			authSet.add(x);
		}
		return authSet;
	}
	
	static ArrayList<String> getBookNameList(String[][] a) {
		ArrayList<String> b = new ArrayList<String>(); 
		for(int i=0; i<a.length; i++) {
			String book = a[i][0];
			b.add(book);
		}
		return b;
	}
	
	static Set<String> availablebook(ArrayList<String> a) {
		Set<String> bookSet = new HashSet<String>();
		for(String x: a) {
			bookSet.add(x);
		}
		return bookSet;
	}
	
	static ArrayList<String> getCategoryList(String[][] a) {
		ArrayList<String> b = new ArrayList<String>(); 
		for(int i=0; i<a.length; i++) {
			String category = a[i][2];
			b.add(category);
		}
		return b;
	}
	
	static Set<String> availableCategory(ArrayList<String> a) {
		Set<String> categorySet = new HashSet<String>();
		for(String x: a) {
			categorySet.add(x);
		}
		return categorySet;
	}
	
	public static void main(String[] args) {
//		System.out.println(getAuthorNameList(bookDB()));
//		
//		System.out.println(availableAuthor(getAuthorNameList(bookDB())));
//		
//		System.out.println(availablebook(getBookNameList(bookDB())));
//		
//		System.out.println(availableCategory(getCategoryList(bookDB())));
		
//		searchBooksByAuthor(bookDB(), "test author");
//		searchBooksByBookName(bookDB(), "test book 3");
		searchBy(bookDB(), "fiction");
	}

}
