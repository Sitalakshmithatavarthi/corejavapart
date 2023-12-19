package iterativestatement;

public class AmstrongNumEx {

	public static void main(String[] args) {
		int num=121,no,rem,sum=0;
		no=num;
		while (no!=0) {
			rem=no%10;
			System.out.println("rem :"+rem);
			no/=10;
		}
        System.out.println("sum :"+sum);
        if (sum==num) {
			System.out.println(num+  "num is armstrong ");
		} else {
			System.out.println(num+ "num is  not armstrong ");

		}
	}

}
