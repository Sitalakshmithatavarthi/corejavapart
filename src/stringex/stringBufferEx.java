package stringex;

public class stringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Append :"+sb.append("All"));
		
		StringBuilder sbuild=new StringBuilder("hello");
		System.out.println("Append :"+sbuild.append("All"));
		System.out.println("reverse :"+sb.reverse());
		

	}

}
