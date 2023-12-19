package collectionex;

import java.util.Iterator;
import java.util.LinkedList;

public class ProductInsert {

	public static void main(String[] args) {
		LinkedList<Product> a1=new LinkedList<>();
		Product p=new Product(1,"tablet",50000);
		a1.add(p);
		a1.add(new Product(1, "chair", 2000));
		a1.add(new Product(2, "dinning table", 5000));
		a1.add(new Product(3, "Washing Machine", 30000));
		System.out.println("Elements in ArrayList using enhanced for loop:");
//		a1.remove(0);
		for(Product p1:a1) {
//			System.out.println(p1);
			System.out.println("id :" +p1.getClass());
			System.out.println("name :" +p1.getClass());
			System.out.println("price :" +p1.getClass());
		}
         System.out.println("Elements in arraylist Using Iterable");
         Iterator<Product> itr=a1.iterator();
         while (itr.hasNext()) {
			Product p1 =  itr.next();
			System.out.println(p1);
		}
	}

}
