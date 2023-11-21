package Recursion;

public class numbersbetweenrange {
	public static void main(String[] args) {

		System.out.println("without using recursion");
		int start = 5;
		int end = 10;
		int sum = 0;
		for (int i = start; i <= end; i++) {

			sum = sum + i;
		}

		System.out.println(sum);
		System.out.println("====================");
		System.out.println("using recursion");
		System.out.println("====================");
		System.out.println(numbersbetweenrange.add(start, end));

	}

	public static int add(int start, int end) {
		if (end > start) {
			return end + add(start, end - 1);// 10+add(9) //10+(9+(add(8))
		} else {
			return end;
		}
	}
}
