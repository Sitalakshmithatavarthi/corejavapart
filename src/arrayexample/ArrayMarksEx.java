package arrayexample;

import java.util.Scanner;

public class ArrayMarksEx {

	public static void main(String[] args) {		
		    {   
		        
				Scanner sc=new Scanner(System.in);
		        int ts;     
		        System.out.println("Enter the total subjects " );
		        ts=sc.nextInt();
		        int arr[] = new int[ts]; 
		        System.out.println("Enter the science marks  in each subject ");
		        
		        for(int i=0;i<ts;i++)   
		        {
		            arr[i]=sc.nextInt();
		        }
		        int total=0;
		        for(int i=0;i<ts;i++)
		        {
		            total=total+arr[i];
		        }
		        
		        System.out.println("The total marks obtained is "+total);
		        float percentage; 
		        percentage = (total / (ts)); 
		        System.out.println( "Total Percentage : "  + percentage + "%");                         
		    }   
		}


}
