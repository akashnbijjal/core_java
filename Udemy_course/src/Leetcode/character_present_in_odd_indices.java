package Leetcode;

import java.util.Scanner;

public class character_present_in_odd_indices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String s1 = "";

		for (int i = 0; i < input.length(); i++) {
			if (i % 2 != 0) {
				// System.out.print(input.charAt(i) + " ");
				s1 = s1 + input.charAt(i) + " ";

			}

		}
		if (s1.length() > 0) {
			System.out.println(s1.toString().trim());

		} else {
			System.out.println("No character is found at odd indices");
		}
		sc.close();

	}
}
