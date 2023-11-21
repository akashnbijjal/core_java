package Array_Search;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item to be Search");
		int item = sc.nextInt();
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				s = "Iteam is found";

			} else {
				s = "Item is not found";
			}
		}
		System.out.println(s);
	}
}
