package exceptionex;

public class ArrayIndexException {

	public static void main(String[] args) {
	try {
		int a[]={1,2,3};
		System.out.println("Array Elenent:"+a[0]);
		int c=20/0;
		System.out.println("Element c:" +c);
	} 
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception");
	}
//	 Every Try block we can use multiple Catch Blocks
	catch (ArithmeticException e1) { 
		System.out.println("Exception block");
	}
	finally {
		System.out.println("This is Finally");
	}


}
}
