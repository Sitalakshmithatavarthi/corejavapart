package inheritance;

 class VehicalExSuperMethod {
 int speed=100;
 void display() {
//	 System.out.println("parent class");
//	 System.out.println("speed of System.out.println("speed of vehical:"+speed);:"+speed);
//	 
 }
 void vType() {
	 System.out.println("four wheeler");
 }
 
 }
 class Car extends VehicalExSuperMethod{
	 int speed=120;
	 void display() {
		 vType();
		 super.display();
		 System.out.println("speed of vehical:"+speed);
		 System.out.println("speed of car:"+speed);

	 }
 }
 public class supeAsVariable{
	public static void main(String[] args) {
		Car c=new Car();
	}
 }
 
 }
 }
 

