package Strings;

import java.util.Iterator;
import java.util.Scanner;

public class Strings8 {
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				System.out.print(ch);
			}
	}
		
		
		for (int i = 0; i < input.length(); i++) {
				char ch=input.charAt(i);
				if(ch>='0'&&ch<='9')
				{
					System.out.print(ch);
				}
		}
		sc.close();
	}
}
