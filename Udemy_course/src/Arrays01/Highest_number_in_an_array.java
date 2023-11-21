package Arrays01;

public class Highest_number_in_an_array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int longest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[0]) {
				longest = arr[i];
			}
		}
		System.out.println(longest);
	}
}
