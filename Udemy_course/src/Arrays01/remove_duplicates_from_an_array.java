package Arrays01;

import java.util.Arrays;

public class remove_duplicates_from_an_array {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 3, 5, 6, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i];
				}else {
					arr[i]=arr[i+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
