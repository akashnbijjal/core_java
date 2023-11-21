package Arrays01;

import java.util.Arrays;

public class finding_duplicates_elements_in_array {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 5, 6, 5 };

		int ayy[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					ayy[i] = arr[i];

				}
			}
		}
		System.out.println(Arrays.toString(ayy));

	}
}
