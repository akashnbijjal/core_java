package Arrays01;

import java.util.Scanner;

public class repeated_element_in_two_sorted_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int[] arr = new int[no1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int no2 = sc.nextInt();
		int[] ayy = new int[no2];

		for (int i = 0; i < ayy.length; i++) {
			ayy[i] = sc.nextInt();
		}
		int k = 0, l = 0;

		while (k < arr.length && l < ayy.length) {
			if (arr[k] == arr[l]) {
				System.out.print(arr[k] + " ");
				k++;
				l++;
			} else if (arr[k] < ayy[l]) {
				k++;
			} else {
				l++;
			}
		}
		sc.close();
	}

}
