package corejava_1;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		boolean flag = true;

		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = s.length() - 1; j >0; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					
					flag=false;

					
				}
			}
		}
		if(flag)
		{
			System.out.println("the word is palindrome");
		}
		else
		{
			System.out.println("the word is not palindrome");
		}

	}
}
