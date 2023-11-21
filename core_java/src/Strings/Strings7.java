package Strings;

import java.util.Scanner;

public class Strings7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		String input = sc.nextLine();
		for (int i = 0; i < input.length() - 1; i++) {
			char ch = input.charAt(i);
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				count++;
			}
		}
		System.out.println(count);

	}

}
