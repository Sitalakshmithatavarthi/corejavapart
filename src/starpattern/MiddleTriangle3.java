package starpattern;

		import java.util.Scanner;

		class MiddleTriangle1 {
			static void printPattern(int n) {
				int i, j;
				for (i = 1; i <= n; i++) {
					for (j = 1; j <= n - i; j++) {
						System.out.print(" ");
					}
					for (j = 1; j <= i; j++) {
					
						System.out.print(j + " ");
					}
					System.out.println();
				}
			}
		}

  		        public class MiddleTriangle3 {

				public static void main(String[] args) {
					Scanner s = new Scanner(System.in);
					System.out.println("Middle Triangle:");
					int num1 = s.nextInt();
					int num2 = s.nextInt();
					int num3 = s.nextInt();
					// MiddleTriangle m = new MiddleTriangle();

					MiddleTriangle1.printPattern(num1);
					MiddleTriangle1.printPattern(num2);
					MiddleTriangle1.printPattern(num3);
				}
  		        }
			

	


