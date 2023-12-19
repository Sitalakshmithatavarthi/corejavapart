package basic;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter u r full name :");
		String fname=sc.nextLine(); 
		System.out.println("Full name:" +fname);
		
		System.out.println("enter a value of n:");
		int n=sc.nextInt();
		System.out.println("value of n :"+n);
		
		System.out.println("enter percentage:");
		float percentage=sc.nextFloat();
		System.out.println(" percentage:"+percentage);
		
		System.out.println(" enter ur input:");;
		String str=sc.nextLine();
		System.out.println(" enter another input:");
		String str2=sc.nextLine();
		System.out.println(str + "" + str2);
	}	
		
		
	
		
	
		
		
		
		
		
		
	

	

}
