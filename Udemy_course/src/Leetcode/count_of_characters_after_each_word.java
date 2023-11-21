package Leetcode;

public class count_of_characters_after_each_word {
	public static void main(String[] args) {
		String s1 = "Tap academy";
		String st[] = s1.split(" ");

		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i] + st[i].length() + " ");
		}
	}
}
