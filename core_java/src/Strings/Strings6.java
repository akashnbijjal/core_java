package Strings;

import java.util.Scanner;

public class Strings6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		
		boolean flag=true;
		
		  for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
	            if (input.charAt(i) != input.charAt(j)) {
	                flag = false;
	                break;
	            }
	        }
		  System.out.println(flag);

	}
}
