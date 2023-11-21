package Recursion;

public class String1 {

	public static String reverse1(String input) {
		if (input.length() <= 1) {
			return input;
		}
		return reverse1(input.substring(1)) + input.charAt(0); 
	}

	public static void main(String[] args) {

		String input = "babbar";
		System.out.println(input.substring(1)+input.charAt(0) );
		String reverse = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			reverse = ch + reverse;

		}
		System.out.println(reverse + "------------------------> iteration method");
		System.out.println(reverse1(input));
	}
}
