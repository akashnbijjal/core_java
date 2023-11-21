package Arrays01;

import java.util.Arrays;

public class Sample3 {

	public static void main(String[] args) {
		String b = "margana";
		char ch1[] = b.toCharArray();

		System.out.println(Arrays.toString(ch1));
		for (int i = 0; i < ch1.length; i++) {
			for (int j = i + 1; j < ch1.length; j++) {
				if (ch1[i] > ch1[j]) {
					char temp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch1));

	}
}
