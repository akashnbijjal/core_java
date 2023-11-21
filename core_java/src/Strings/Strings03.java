package Strings;

import java.util.Scanner;

public class Strings03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int index=sc.nextInt();
		
		if(index>=0&&index<s.length())
		{
			char c=s.charAt(index);
			System.out.println(c);
			
		}
		else {
			System.out.println("Invalid index");
		}
	}
}
