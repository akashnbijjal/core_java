package Strings;

public class lastoccuranceofindex {
	public static void main(String[] args) {
		String s = "Tapacademy";
		String s1 = "a";
		for (int i = 0; i <= s.length(); i++) {
			char ch = s1.charAt(i);
			if (s.charAt(i) == ch) {
				System.out.println(i);
			}
		}
	}
}
