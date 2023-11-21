package Leetcode;

public class ValidPalindrome {

	public static boolean isPalindrome(String input) {

		System.out.println(input);
		String sb = new StringBuilder(input).reverse().toString();
		
		if (sb.equals(input)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s = "0P";
		String input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(ValidPalindrome.isPalindrome(input));
	}
}
