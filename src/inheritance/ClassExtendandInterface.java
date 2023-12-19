package inheritance;
interface ABC {
	void printABC() ;

	void printchild();
}
interface XYZ{
	void printXYZ() ;
}
interface PQR extends  ABC,XYZ{
	void printPQR() ;
}
class child implements ABC,XYZ{

	@Override
	public void printABC() {
		System.out.println("This class belong to ABC class");
		
	}

	@Override
	public void printXYZ() {
		System.out.println("This class belong to xyz class");
		
	}

	@Override
	public void printchild() {
		System.out.println("This class belong to PQR class");
		
	}
	
}
public class ClassExtendandInterface {
   
	public static void main(String[] args) {
		child abc=new  child();
		abc.printABC();
		abc.printXYZ();
		abc.printchild();
	}

}
