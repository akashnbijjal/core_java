package corejava_1;

import java.util.Scanner;

public class java3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int no = scanner.nextInt();

		int[] arr = new int[no];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					System.out.print(arr[i] + " " + arr[j]);
					System.out.println();
				}
			}
		}

	}
}
