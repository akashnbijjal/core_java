package Leetcode;

public class String_to_Integer_atoi {
	public static int myAtoi(String s) {
		String st = s.replaceAll("[^a-zA-Z0-9-]", "");

		return Integer.parseInt(st);
	}

	public static void main(String[] args) {
		String s = "-42";
		System.out.println("The parsed integer is " + myAtoi(s));
	}

}
