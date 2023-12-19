package oops;
abstract class Fruit{
	abstract void display();
	
}
class Mango extends Fruit{

	@Override
	void display() {
		System.out.println("Mango");
	}
}
	class Banana extends Fruit{

		@Override
		void display() {
			
			System.out.println("Banana");
		}
	
}
public class AbstractClass {
//	Fruit f=new Fruit(); we can not create object of abstract clas
	public static void main(String[] args) {
		Fruit m=new Mango();
		m.display();
		Fruit b=new Banana();
		b.display();
		Fruit fref;
		Mango m1=new Mango();
		fref=m1;
		fref.display();
         Fruit fref1;
         Banana b1=new Banana();
         fref1=b1;
         fref1.display();
	}

}
