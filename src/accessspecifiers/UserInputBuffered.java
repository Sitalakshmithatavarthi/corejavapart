package accessspecifiers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//IOException -->checked-->compile time exception
public class UserInputBuffered {

	public static void main(String[] args) throws IOException {
		
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter ur name:");
String name=br.readLine();
System.out.println("Name :" +name);


	}

}
//public class CheckedException {
//
//	public static void main(String[] args) {
//	
//			try {
//				Class.forName("basic.Demo");
//				//File f=new File("demo123.txt");
//				System.out.println("Class found");
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Class  not found"+e);
//			}





//File f = new File("f:/filepooja11.txt");
//if(!f.exists()){
//throw new Exception("File doesnot exist "+f.toString());
//}
//else {
//System.out.println("Welcome, we got into file "+f.toString());
//}