package Arrays01;

import java.util.Arrays;

public class Inserting_array {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5 };
		System.out.println(Arrays.toString(arr));
		int index = 2;
		int insert = 3;// value to be inserted

		int ayy[] = new int[arr.length + 1];

		for (int i = 0; i < ayy.length; i++) {
			if (i < index) {
				ayy[i] = arr[i];
			} else if (i == index) {
				ayy[i] = insert;
			} else {
				ayy[i] = arr[i - 1];
			}
		}

		System.out.println(Arrays.toString(ayy));
	}
}
