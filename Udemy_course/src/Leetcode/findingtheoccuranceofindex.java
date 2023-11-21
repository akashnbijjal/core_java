package Leetcode;

public class findingtheoccuranceofindex {
	public static void main(String[] args) {
		String s1 = "Tapacademy";
		char input = 'a';
		int i = 0;
		for (int j = 0; j < s1.length() - 1; j++) {
			char ch = s1.charAt(j);
			if (input == ch) {
				i = j;

			}
		}
		System.out.println(i);
	}
}
