package Recursion;

import java.util.Scanner;

public class fibonacciseries {
	static int n1 = 0, n2 = 1, n3 = 0;

	static int printFibonacci(int count) {
		if (count > 0) { //8>0 --> true
			n3 = n1 + n2;  //n3=1;
			n1 = n2;       //n1=1;
			n2 = n3;       //n2=1;

			return printFibonacci(count - 1); //7
		}
		return count;
	}

	public static void main(String args[]) {
		int count = 10;
		System.out.print(n1 + " " + n2);
		for(int)
		System.out.print(n1 + " " + n2);// printing 0 and 1
		System.out.println(printFibonacci(count - 2));//8 // n-2 because 2 numbers are already printed
	}
}
