package oops;

public class MethodOVerlaodingEx1 {
			void shape(int l,int b) {
				System.out.println("Reactangle area :"+(l*b));
			}
			void shape(int b,float h) {
				System.out.println("Triangle area :"+(0.5*b*h));
			}
			void shape(float b,int h) {
				System.out.println("Triangle area :"+(0.5*b*h));
			}
			public static void main(String[] args) {
				MethodOVerlaodingEx1 m=new MethodOVerlaodingEx1();
				
				m.shape(10,20);
				m.shape(2, 0.5f);
				m.shape(3.4f,10);
				

			}

		
	}


