package Array_java_8;

import java.util.Arrays;

public class Maximum_and_Minimum_in_an_Array {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };

		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println(min);
	}
}
