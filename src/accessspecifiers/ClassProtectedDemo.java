package accessspecifiers;
class Bike{
	protected int Speed;
	protected Bike (int Speed) {
		this.Speed=Speed;
		
	}
	protected void display(){
		System.out.println("Bike class"+this.Speed);
		
	}
}
class SSW extends Bike{

	protected SSW(int Speed) {
		super(Speed);
		// TODO Auto-generated constructor stub
	}
	void displaySSW()
	{
		display();
		System.out.println("SSW class");
	}
}
public class ClassProtectedDemo {

	public static void main(String[] args) {
		Bike b=new Bike(50);
		b.display();
		SSW s=new SSW(200);
		s.display();
		
	}

}
