package arrayexample;

public class SortNumArray {

	public static void main(String[] args) {
		int a[]= {11,2,35,4,89,56,23};
		System.out.println("My sorted Array:");
		  for (int i = 0; i < a.length; i++) {
		      for (int j = i + 1; j < a.length; j++) {
		        int temp = 0;
		        if (a[i] > a[j]) {
		          temp = a[i];
		          a[i] = a[j];
		          a[j] = temp;
		        }
		      }      
		      System.out.println(a[i]);
	}

}


	}


