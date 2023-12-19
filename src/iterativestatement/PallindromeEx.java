package iterativestatement;

public class PallindromeEx {
	public static void main(String[] args) {
		String str="noon";
     StringBuffer sb=new StringBuffer("noon");
     sb.reverse();
     String rstr=sb.toString();
     System.out.println("Reverse String :"+rstr);
     if (str.equals((rstr))) {
		System.out.println("String is pallindrome");
	} else {
		System.out.println("String not is pallindrome");
	}
    	 
     }
	}
