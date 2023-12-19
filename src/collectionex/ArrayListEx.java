package collectionex;

import java.util.ArrayList;
import java.util.Collections;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer>arrayList=new ArrayList<>();
		arrayList.add(85);
		arrayList.add(60);
		arrayList.add(30);
		arrayList.add(10);
		Collections.sort(arrayList);
	 System.out.println("is Empty(): " +arrayList.isEmpty());
System.out.println("contains()" +arrayList.contains(100));
System.out.println("index of():"+arrayList.indexOf(10));
System.out.println(" last index of():"+arrayList.lastIndexOf(10));
	}
}
	

