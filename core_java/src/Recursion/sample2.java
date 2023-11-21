package Recursion;

public class sample2 {

	public static int fact(int no) {
		if (no > 1) {
			return fact(no - 1) * no;
		} else {
			return no;
		}
	}

	public static void main(String[] args) {
		System.out.println(fact(4));
	}
}
