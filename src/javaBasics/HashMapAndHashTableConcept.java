package javaBasics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Hashtable;

public class HashMapAndHashTableConcept {
	
	// HashMap & Hashtable -> both are classes, data table structure, key-value pair, hashcode for key

	public static void main(String[] args) {
		// HashMap
//		HashMap hm = new HashMap(); // raw type/non-parameterized
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); // parameterized -> <String, Integer> -> <Key,Value> 

		// put() -> creating entry => <Key, Value>
		hm.put("Messi", 10);
		hm.put("Neymar", 11);
		hm.put("Bappe", 9);
		hm.put("Halland", 12);
		hm.put("C.Ronaldo", 7);
		
		System.out.println(hm);
		
		// get() -> extract value by providing key
		System.out.println(hm.get("Neymar"));
		System.out.println(hm.get("Halland"));
		System.out.println(hm.get("Suarez")); // if key not present - null value
		
		// size() -> number of entries
		System.out.println("Number of entries: "+hm.size());
		
		// remove()
//		hm.remove("Halland");
//		System.out.println(hm);
//		hm.remove("Bappe", 9);
//		System.out.println(hm);
		
		System.out.println(hm);
		hm.put("Neymar", 15); // duplicate key -> replaces value
		hm.put("Giroud", 9); // duplicate value -> no issue, can be duplicated
		System.out.println(hm);
		
//		hm.remove("Bappe", 9);
//		System.out.println(hm);
		
		// replace()
		hm.replace("Giroud", 11);
		System.out.println(hm);
		hm.replace("Neymar", 15, 8);
		System.out.println(hm);
		
		// clone()
		Object hmClone = hm.clone();
		
		// equals() - compare
		System.out.println(hm.equals(hmClone));
		
		// clear() - remove all entries
//		hm.clear();
//		System.out.println(hm.equals(hmClone));
		
		// containsKey() / containsValue
		System.out.println(hm.containsKey("Bappe"));
		System.out.println(hm.containsValue(15));
		
		// keySet() -> captures all keys -> Set<KeyParameter>
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		// values() -> captures all values -> Collection<valueParameter>
		Collection<Integer> allValues = hm.values();
		System.out.println(allValues);
		
		// entrySet() -> captures all entries -> Set<Entry<KeyParameter, ValueParameter>> 
		Set<Entry<String, Integer>> entries = hm.entrySet();
		System.out.println(entries);
		
		// Traversing HashMap
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.print(hm.get(it.next())+" ");
		}
		
		System.out.println();
		for(String key: keys) {
			System.out.print(hm.get(key)+" ");
		}
		
		// null key or value - no issue in HashMap
//		hm.put(null, 20); // null key
//		System.out.println(hm);
//		System.out.println(hm.get(null));
		hm.put("Shala", null); // null value
		System.out.println(hm);
		System.out.println(hm.get("Shala"));
		hm.put(null, null);
		System.out.println(hm);
		
		// Hashtable
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>(); // parameterized -> <String, Integer> -> <Key,Value> 

		// put() -> creating entry => <Key, Value>
		ht.put("Messi", 10);
		ht.put("Neymar", 11);
		ht.put("Bappe", 9);
		ht.put("Halland", 12);
		ht.put("C.Ronaldo", 7);
		
		System.out.println(ht);
		
		// get() -> extract value by providing key
		System.out.println(ht.get("Neymar"));
		System.out.println(ht.get("Halland"));
		System.out.println(ht.get("Suarez")); // if key not present - null value
		
		// size() -> number of entries
		System.out.println("Number of entries: "+ht.size());
		
		// remove()
//		ht.remove("Halland");
//		System.out.println(ht);
//		ht.remove("Bappe", 9);
//		System.out.println(ht);
		
		System.out.println(ht);
		ht.put("Neymar", 15); // duplicate key -> replaces value
		ht.put("Giroud", 9); // duplicate value -> no issue, can be duplicated
		System.out.println(ht);
		
//		ht.remove("Bappe", 9);
//		System.out.println(ht);
		
		// replace()
		ht.replace("Giroud", 11);
		System.out.println(ht);
		ht.replace("Neymar", 15, 8);
		System.out.println(ht);
		
		// clone()
		Object htClone = ht.clone();
		
		// equals() - compare
		System.out.println(ht.equals(htClone));
		
		// clear() - remove all entries
//		ht.clear();
//		System.out.println(ht.equals(htClone));
		
		// containsKey() / containsValue
		System.out.println(ht.containsKey("Bappe"));
		System.out.println(ht.containsValue(15));
		
		// keySet() -> captures all keys -> Set<KeyParameter>
		Set<String> keysHt = ht.keySet();
		System.out.println(keysHt);
		
		// values() -> captures all values -> Collection<valueParameter>
		Collection<Integer> allValuesHt = ht.values();
		System.out.println(allValuesHt);
		
		// entrySet() -> captures all entries -> Set<Entry<KeyParameter, ValueParameter>> 
		Set<Entry<String, Integer>> entriesHt = ht.entrySet();
		System.out.println(entriesHt);
		
		// Traversing HashMap
		Iterator<String> itHt = keysHt.iterator();
		while(itHt.hasNext()) {
			System.out.print(ht.get(itHt.next())+" ");
		}
		
		System.out.println();
		for(String key: keysHt) {
			System.out.print(ht.get(key)+" ");
		}
		
		// null key or value - in Hashtable not allowed
//		ht.put(null, 20); // NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//		ht.put("Shala", null); // NullPointerException
//		ht.put(null, null); // NullPointerException
		
		System.out.println();
		
		// Using HashMap in a scenario
		String[] customer_1_Info = {"Mark", "1234567689", "mk@gmail.com"};
		String[] customer_2_Info = {"Jack", "2345676890", "jm@gmail.com"};
		
		HashMap<String, String[]> customerProfile = new HashMap<String, String[]>();
		customerProfile.put("mk001", customer_1_Info);
		customerProfile.put("jm002", customer_2_Info);
		
		Set<String> customerIDs = customerProfile.keySet();
		for(String customerID: customerIDs) {
			System.out.println("Customer information of: "+customerID);
			for(String cusInfo: customerProfile.get(customerID)) {
				System.out.println(cusInfo);
			}
			System.out.println("----------------------------------");
		}
	}
	
	// Assignment:
			// 1. HashMap and Hashtable -> similarity & differences
			// 2. Library application -> Each book details is in array -> Every book category is in ArrayList -> Each both has bookID maintained in HashMap/Hashtable -> Get all info of book based on customer/bookID selection

}
