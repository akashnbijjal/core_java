package Arrays;

public class Arrays4 {
	public static void main(String[] args) {
		// Number of pairs in the array
		int arr[] = { 1, 2, 3, 4, 5 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				count++;
			}
		}
		System.out.println(count);
	}
}
