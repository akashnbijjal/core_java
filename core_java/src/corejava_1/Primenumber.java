package corejava_1;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {

//		int[] arr = { 1, -4, -6, 3, 10, -20 };
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			sum = sum + Math.abs(arr[i]);
//
//		}
//		System.out.println(sum);

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		boolean flag = true;
		for (int i = 2; i <= no/2; i++) {
			if (no % i == 0) {   
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println("Number --->" + no + " is prime");
		} else {
			System.out.println("is not a prime number");
		}

	}
}
