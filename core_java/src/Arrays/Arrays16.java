package Arrays;

import java.util.Arrays;

public class Arrays16 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum=arr[i]+sum;
		}
		System.out.println(sum);

	}
}
