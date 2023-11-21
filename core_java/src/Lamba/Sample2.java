package Lamba;

interface add {
	public int add(int a, int b);
}

public class Sample2 {
	public static void main(String[] args) {
		add a1 = (a, b) -> a + b;

		System.out.println(a1.add(1, 2));
	}
}
