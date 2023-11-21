package Strings;

import java.util.Scanner;

public class Strings10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'A') {
				System.out.print("*" + ch);
			} else {
				System.out.print(ch);
			}
		}
	}
}
