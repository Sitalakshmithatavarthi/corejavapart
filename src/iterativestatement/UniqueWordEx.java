package iterativestatement;

public class UniqueWordEx {

	
		
				int count;

				
				String[] words = str.split("\\W");

				
				for (int i = 0; i < words.length; i++) {

					
					count = 1;
					
					for (int j = i + 1; j < words.length; j++) {
						
						if (words[i].equalsIgnoreCase(words[j])) {

							
							count++;

							words[j] = "";
						}
					}

					
					if (count == 1 && words[i] != "")

						
						System.out.println(words[i]);
				}
			

			public static void main(String[] args)
			{
				
				String str = "Welcome to geeks for geeks";

				
				UnixWo (str);
			}

}
//public class FunctionDemo {
//int a=10,b=20;
////function without return type/patameter
//void add() {
//	System.out.println("Addition:"+(a+b));
//}
////function without return type but with patameter
//void addition(int n1,int n2) {
//	System.out.println("Addition:"+(n1+n2));
//}
//int mul() {
//	return a*b;	
//}
//int mul(int a,int b) {
//	return a*b;
//}
//static String display() {
//	return "HEllo EVeryone";
//}
//public static void main(String[] args) {
//	FunctionDemo demo=new FunctionDemo();
//	demo.add();
//	demo.addition(3, 4);
//	System.out.println("Multiplication: "+demo.mul());
//	System.out.println("Multiplication: "+demo.mul(4,5));
//	System.out.println("Static method :"+display());
//	System.out.println("Static method of another class :"+StaticMethod.div(8,2));
//
//}
//
}