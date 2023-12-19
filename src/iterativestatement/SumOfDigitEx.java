package iterativestatement;

public class SumOfDigitEx {

	public static void main(String[] args) {
//		int num=123,d=0,sum=0;
//		while (num!=0) {
//			d=num%10;
//			sum=sum+d;
//			num=num/10;
//		}
//		System.out.println("sum of digit:"+sum);
//	}
//}
int no = 153,  ono, rem, sum = 0;

ono = no;

while ( ono != 0)
{
	rem = ono % 10;
	System.out.println("rem :"+rem);
    sum += Math.pow(rem, 3);
    ono/= 10;
}
System.out.println("Sum :"+sum);

if(sum ==no)
    System.out.println(no + " is an Armstrong number.");
else
    System.out.println(no + " is not an Armstrong number.");
}
}

