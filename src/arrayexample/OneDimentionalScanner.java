package arrayexample;

import java.util.Scanner;

public class OneDimentionalScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);{
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter elements:");
        for(int i=0;i<size;i++) {
        	a[i]=sc.nextInt();
        	
        }
        System.out.println("My array elements");
        for(int i=0;i<size;i++) {
        	System.out.println(a[i]);
	}


	    

}
	}
}
