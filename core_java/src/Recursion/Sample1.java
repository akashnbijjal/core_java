package Recursion;

public class Sample1 {
	static int x = 0;
	public static int print(int n) {
		
		if (n > 0) {

			x++;
			
			return print(n - 1) + x;
		}
		return n;
	}

	public static void main(String[] args) {

		System.out.println(print(5));
	}
}
