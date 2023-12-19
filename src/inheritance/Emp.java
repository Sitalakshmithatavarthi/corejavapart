package inheritance;

public class Emp {
	void companyName() {
		System.out.println("tcs");
	}
	class permanentEmp extends Emp{
		int da=500,hra=5000,ta=2000,sal;
		public permanentEmp(int sal) {
			sal=da+hra+ta+sal;
			System.out.println("salary of parment:" +sal);
		}
	}
	class TempEmp extends Emp
	{
		
	
	class constractemp extends Emp{
		
	}
public class HierachicalInheritance{
	

	public static void main(String[] args) {
		permanentEmp p=new permanentEmp(35000);
		p.companyName();

	}

}
}
}

