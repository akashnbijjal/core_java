package Arrays01;

import java.util.Arrays;

public class Sample4 {
	public static void main(String[] args) {
		String a = "anagram";
		String b = "margana";
		char ch1[] = a.toLowerCase().toCharArray();
		char ch2[] = b.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			for (int j = i + 1; j < ch1.length; j++) {
				if (ch1[i] > ch1[i]) {
					char temp = ch1[i + 1];
					ch1[i] = ch1[j];
					ch1[j] = temp;
				}
			}

		}
		System.out.println(ch1);
		for (int i = 0; i < ch2.length; i++) {
			for (int j = i + 1; j < ch2.length; j++) {
				if (ch2[i] > ch2[i + 1]) {
					char temp = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = temp;
				}
			}
		}
		System.out.println(ch2);
		boolean result = true;
		if (ch1.length != ch2.length) {
			result = false;
		} else {
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					result = false;
					break;
				}
			}
		}

		if (result) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

	}
}
