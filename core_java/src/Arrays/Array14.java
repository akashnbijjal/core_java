package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array14 {
	public static void main(String[] args) {
		// search the element in an array

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int arr[] = { 2, 3, 4, 5, 6, 7 };
		boolean result = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == no) {
				result = true;
				break;
			}
		}
		
		//by using direct Arrays method
		int result1=Arrays.binarySearch(arr, no);
		
		
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		if (result1<0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
