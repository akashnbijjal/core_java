package Leetcode;

public class odd_indices_at_even_indices {
	public static void main(String[] args) {
		String s1 = "India is my country";
		String st[] = s1.split(" ");
		String even = "";
		String odd = "";

		System.out.println(st[1]+" " + st[0]+" " + st[st.length-1]+" " + st[st.length-2]);

	}
}
