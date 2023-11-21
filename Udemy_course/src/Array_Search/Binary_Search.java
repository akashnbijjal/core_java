package Array_Search;

import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 20, 30, 40, 50 };

		System.out.println("Enter the item to be search");
		int item = sc.nextInt();
		int beg = 0;
		int end = arr.length - 1;
		int c = 0;
		int mid = 0;
		while (beg <= end) {
			mid = (beg + end) / 2;
			if (arr[mid] == item) {
				c++;
				break;
			} else if (item > arr[mid]) {
				beg = mid + 1;
			} else if (item < arr[mid]) {
				end = mid - 1;
			}
		}
		if (c > 0) {
			System.out.println("Item is found " + mid + "th index");
		} else {
			System.out.println("Item is not found");
		}
		sc.close();

	}
}
