package Array_Search;

import java.util.Arrays;
import java.util.Scanner;

public class By_using_java_8 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item to be Search");
		int item = sc.nextInt();

		boolean result = Arrays.stream(arr).boxed().anyMatch(x -> x == item);
		if (result) {
			System.out.println("Item found");
		} else {
			System.out.println("Item not found");
		}
		sc.close();
	}
}
