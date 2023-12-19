package collectionex;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> even =new HashSet<>();
		even.add(5);
		even.add(8);
		even.add(1);
		System.out.println("The Hash set Elements");
HashSet<Integer> numbers =new HashSet<>();
numbers.add(1);
numbers.add(4);
numbers.add(5);
numbers.addAll(even);
System.out.println("Union as:" +numbers);
numbers.retainAll(even);
System.out.println("Intersection as:" +numbers);
numbers.removeAll(even);
System.out.println("difference as:" +numbers);
	

//    HashSet<Integer> numbers = new HashSet<>();
//    numbers.add(1)
//    numbers.add(3);
//    numbers.add(2);
//    System.out.println("HashSet2: " + numbers);
//
//    // Union of two set
//    numbers.addAll(even);
//    System.out.println("Union is: " + numbers);
//    numbers.retainAll(even);
//    System.out.println("Intersection is: " + numbers);
//    numbers.removeAll(even);
//    System.out.println("Diffrence : " + numbers);
}
}
