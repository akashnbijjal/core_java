package Array_java_8;

import java.util.Arrays;

public class Count_Negative_Numbers {
	public static void main(String[] args) {
		int arr[] = { 10, -20, -30, 40, -50 };

		long count = Arrays.stream(arr).filter(i -> i < 0).count();
		System.out.println(count);
	}
}
