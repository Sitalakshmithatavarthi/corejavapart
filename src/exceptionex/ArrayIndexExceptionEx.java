package exceptionex;

public class ArrayIndexExceptionEx {

	public static void main(String[] args) {
		try {
			int a[]={1,2,3};
			System.out.println("Array Elenent:"+a[0]);
			int c=20/0;
			System.out.println("Element c:" +c);
			String s1="ABC";
			String s="123";
			int ss=Integer.parseInt(s1);
			System.out.println("value of ss:"+ss);
		   int a1[] = null; 
        System.out.println("The length of the array arr is: " + a1.length);
           String st1=null;
           System.out.println("The length of the array arr is: " + st1.length());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception");
		}
		catch (ArithmeticException e1) { 
			System.out.println("Exception block");
		}
		finally {
			System.out.println("This is Finally");
		}
	}

	}


