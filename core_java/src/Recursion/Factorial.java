package Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = 1;
		for (int i = number; i >= 1; i--) {
			result = result * i;
		}
		System.out.println(result);
		sc.close();
		System.out.println("===================");
		System.out.println("by using recursion");
		System.out.println("===================");
		System.out.println(Factorial.fact(number));
	}

	public static int fact(int number) {
		if (number == 0 || number == 1) {
			return number;
		} else {
			return number * fact(number - 1);

		}
	}
}
