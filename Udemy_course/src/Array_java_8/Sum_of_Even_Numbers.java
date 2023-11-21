package Array_java_8;

import java.util.Arrays;

public class Sum_of_Even_Numbers {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = Arrays.stream(arr).filter(i -> i % 2 == 0).sum();
		System.out.println(sum);
	}
}
