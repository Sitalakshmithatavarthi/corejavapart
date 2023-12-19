package starpattern;

public class MiddlePattern2 {
//	public static void main(String[] args) {
public static void printPattern(int n) {
	int rowCount = 1;

	for (int i = n; i > 0; i--) {
		for (int j = 1; j < i; j++) {
			System.out.print(" ");//space
		}

		for (int j = 1; j <= rowCount; j++) {
			System.out.print(rowCount + " ");
		}

		System.out.println();

		rowCount++;
	}
}

}
