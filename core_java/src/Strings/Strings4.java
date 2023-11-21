package Strings;

import java.util.Scanner;

public class Strings4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 1) {
				char c = input.charAt(i);
				System.out.print(c+" ");
			}
		}
	}
}
