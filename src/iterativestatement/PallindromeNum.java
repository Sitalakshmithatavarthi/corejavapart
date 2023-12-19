package iterativestatement;

public class PallindromeNum {

	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int rev=0;
		while (num!=0) {
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		System.out.println("reverse :"+rev);
		if(temp==rev) {
			System.out.println("PallindromeNum");
		}
		else {
			
			System.out.println("not PallindromeNum");
		}
			
			
			
	
			
		

	}

}
