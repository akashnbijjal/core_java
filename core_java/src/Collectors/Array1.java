package Collectors;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr.length - 2; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

//		Arrays.sort(arr);
//
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
	}
}
