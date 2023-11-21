package Recursion;

public class printingnumbersfrom100 {

	public static void print(int input) {
		if (input >= 1) {
			System.out.println(input);
			print(input - 1);
		}
	}

	public static void main(String[] args) {
		int input = 100;
		print(input);
	}
}
