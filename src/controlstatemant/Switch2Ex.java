package controlstatemant;

import java.util.Scanner;

public class Switch2Ex {
	public static void main(String[] args) {
		char ch;
		int number1,number2,result;
		Scanner input=new Scanner(System.in);
		System.out.println("choose an operater:+,-,*,%");
		ch=input.next().charAt(0);
		System.out.println("Operator==>"+ch);
		
		System.out.println("Enter first number");
		number1=input.nextInt();
		System.out.println("Enter first number");
		number2=input.nextInt();
		switch (ch) {
		case 1: {
			result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;
		}
		case 2:{
			result = number1 + number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		
	}
}
