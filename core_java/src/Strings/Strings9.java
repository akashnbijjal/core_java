package Strings;

import java.util.Scanner;

public class Strings9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')) {
				System.out.print(ch);
			}
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
				System.out.print(ch);
			}
		}
		sc.close();

	}
}
