package Arrays01;

import java.util.Arrays;

public class delete_element_from_array {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int index = 3;
		int b[] = new int[a.length - 1];

		for (int i = 0; i < b.length; i++) {
			if (i < index) {
				b[i] = a[i];
			}else {
				b[i] = a[i+1];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
