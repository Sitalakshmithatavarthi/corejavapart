package stringex;

public class StringOperator {
public static void main(String[] args) {
	String s="Hello";
	String s1="Hi";
	String s2=new String("every one");
    System.out.println("Length :"+s.length());
    System.out.println("Concate :"+s.concat(s1));
    System.out.println("UpperCase:"+s.toUpperCase());
    System.out.println("Equal :"+s.equals(s1));
    System.out.println("Char at :"+s.charAt(2));
    System.out.println("split :"+s.split(s1));
    System.out.println("join :"+s.join(s1));
    System.out.println("Ends with :" + s.endsWith("123"));
    System.out.println("Constains :"+s.contains(s1));
    System.out.println("IsEmpty :"+s1.isEmpty());
	System.out.println("substring :" + s.substring(2, 5));
	String str1 = "Java123is456fun";
	String regex = "\\d+";
}
}
