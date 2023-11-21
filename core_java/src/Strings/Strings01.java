package Strings;

import java.util.Scanner;

public class Strings01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i));
		}
		sc.close();
	}
}
