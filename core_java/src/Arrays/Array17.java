package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int no = sc.nextInt();
		int arr[] = new int[no];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}
