package Strings;

import java.util.Scanner;


public class Strings02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<'z'||ch>='0'&&ch<='9')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
