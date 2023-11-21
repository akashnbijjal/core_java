package Array_java_8;

import java.util.Arrays;

public class Arrays_contains_element {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int target = 30;

		boolean element = Arrays.stream(arr).anyMatch(i -> i == target);
		

		if (element) {
			System.out.println("element found");
		} else {
			System.out.println("Element not found");
		}
	}
}
