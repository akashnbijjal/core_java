package Recursion;

public class printingnumbers {

	public static void print(int start, int end) {
		if (start <= end) {
			System.out.println(start);
			print(start + 1,end);
		}
	}

	public static void main(String[] args) {
		int input = 100;
		print(1, input);
	}
}
