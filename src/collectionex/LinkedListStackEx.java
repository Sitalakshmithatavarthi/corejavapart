package collectionex;

import java.util.Stack;

public class LinkedListStackEx {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();

		s.push(10);
		s.push(12);
		s.push(14);
		System.out.println("My elements:"+s);
		s.pop();
		System.out.println("After Pop my elements:"+s);
		System.out.println("Top of the elment:"+s.peek());//top of elemnt
		System.out.println(s.isEmpty());
	    }
	}


