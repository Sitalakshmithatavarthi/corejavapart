package iterativestatement;

public class FunctionDemo {

	
		
		public class FunctionDemo1 {
			int a=10,b=20;
			void add() {
				System.out.println("Addition:"+(a+b));
			}
			//function without return type but with patameter
			void addition(int n1,int n2) {
				System.out.println("Addition:"+(n1+n2));
			}
			int mul() {
				return a*b;	
			}
			int mul(int a,int b) {
				return a*b;
			}
			static String display() {
				return "HEllo EVeryone";
			}
			public static void main(String[] args) {
				FunctionDemo1 demo=new FunctionDemo1();
				demo.add();
				demo.addition(3, 4);
				System.out.println("Multiplication: "+demo.mul());
				System.out.println("Multiplication: "+demo.mul(4,5));
				System.out.println("Static method :"+display());
				
			}
		
		
}	
}	
			
		
		
	
