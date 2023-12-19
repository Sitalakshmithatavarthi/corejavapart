package assignment;
import java.io.*; 
import java.util.*;
 import java.text.*;
 import java.math.*;
import java.util.regex.*;
public class ImAstardam {
		public class InAmsterdam {
			  public int CountAm(String str){
			  int count=0;
			 String lowerCaseStr=str.toLowerCase();
			 int index=lowerCaseStr.indexOf("am");
			 while(index!=-1){
			 count++;
			 index=lowerCaseStr.indexOf("am",index +2);
			 }
			 return count;
			 
			 }
			 
			 
			 public class Source {
			 public static void main(String args[] ) throws Exception {
			 Source obj=Source();
			 String inputString="I AM IN Amsterdam i am?";
			 int result =obj.countAm(inputString);
			 System.out.println("number of times apper in string :" +result);
	}

			}


			public static Source Source() {
				// TODO Auto-generated method stub
				return null;
			}

			
			}

}
