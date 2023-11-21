package Arrays;

import java.util.Arrays;

public class sortarray1 {
	public static int findFirstUnsortedIndex(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return i;
			}
		}
		return -1; // If the array is already sorted
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 4, 5, 7 };
		int index = findFirstUnsortedIndex(arr);
		System.out.println(index);
	}
}
