package corejava_1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long no = sc.nextInt();
		long a = 0, b = 1;
		System.out.print(a + "" + b);
		for (int i = 2; i <no; ++i) {
			long c = a + b;
			
			
			a = b;
			b = c;
			System.out.print(c%10);
		}
		

	}

}
