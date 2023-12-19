package oops;
interface A{
	void msg();
}
interface B{
	void msg();
}

class C implements A,B{

	@Override
	public void msg() {
		System.out.println("This class name is c");
		
	}
	
}
public class ClassMultilevel {
	public static void main(String[] args) {
		C cc=new C();
		cc.msg();
	}
}
