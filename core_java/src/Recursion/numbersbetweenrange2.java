package Recursion;

public class numbersbetweenrange2 {
	public static int sum(int start, int end) {
		if (end > start) {
			return end+sum(start, end-1);
		}
		return end;
	}

	public static void main(String[] args) {
		System.out.println(sum(5, 10));

	}
}
