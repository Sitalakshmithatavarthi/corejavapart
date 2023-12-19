package collectionex;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSetEx2 {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(100, "Lica");
		ht.put(200, "Html");
		ht.put(300, "java");
//	ht.put(4, null);  # Hash table is synchronized and not allowed null key,value
//	                  # Hash Map is Asynchronized and It  allowed null key,value

		System.out.println("the hash table:" + ht);

	}
}