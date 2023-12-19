package iterativestatement;

public class StringCountEx {

	public static void main(String[] args) {
		String str = "    Hello Everyone I am fine    ";

		str = str.trim();

//		    String[] words = str.split("\\s+");
		String[] words = str.split(" ");

		int wordCount = words.length;
		System.out.println("Number of words: " +wordCount);
			}
		


	}
//count with for
//String[] words = str.split(" ");
//for(int i=0;i<words.length;i++) {
//	System.out.println(i+"---"+words[i]);
//}


