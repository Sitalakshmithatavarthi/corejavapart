package iterativestatement;

public class ReveseString {

	public static void main(String[] args) {
		String n="sitalakshmi";
		String rev=" ";
		for(int i=n.length()-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
			
		}
		System.out.println("rev :"+rev);
	}
		
}
	


