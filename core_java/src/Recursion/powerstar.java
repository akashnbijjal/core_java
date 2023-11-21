package Recursion;

public class powerstar {
	public static int mul(int a, int b) {
//		if (b == 0) {
//			return 1;
//		}
//		return mul(a, b - 1) * a;

		int result = 1;
		for (int i = 0; i < b; i++) {
			result = result * a;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 4));
		System.out.println(mul(2, 4));
	}
}
