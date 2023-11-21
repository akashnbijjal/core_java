package Recursion;

public class palindrome {
	
	public static void 
	
	
	public static void main(String[] args) {
		String input = "Gadag";
		
		String palindrome = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			palindrome = ch + palindrome;
		}
	
		if ((input.toLowerCase()).equals(palindrome.toLowerCase())) {
			System.out.println(input + " is palindrome ---> using iteration");
		}
	}
}
