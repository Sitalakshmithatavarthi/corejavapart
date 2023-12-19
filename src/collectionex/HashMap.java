package collectionex;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer, String> hm=new java.util.HashMap<>();
		hm.put(1, "Lica");
		hm.put(2, "Html");
		hm.put(3, "java");
		hm.put(5, "Sql");
		hm.put(4, null);
		hm.putIfAbsent(4, ".net");
//	  # Hash table is synchronized and not allowed null key,value
//	                  # Hash Map is Asynchronized and It  allowed null key,value

		System.out.println("the hash table:" + hm);
		System.out.println("EntrySet" + hm.entrySet());
		System.out.println(hm.containsValue(8));
	

Iterator<Entry<Integer, String> > new_Iterator= hm.entrySet().iterator();
//Iterating every set of entry in the HashMap
while (new_Iterator.hasNext()) {
 Map.Entry<Integer, String> new_Map = (Map.Entry<Integer, String>) new_Iterator.next();
 // Displaying HashMap
 System.out.println(new_Map.getKey() + " = "+ new_Map.getValue());	
}
}
}