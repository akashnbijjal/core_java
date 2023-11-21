package Lamba;

interface multi {
	public int multiply(int a, int b);

}

public class Test2 {

	public static void main(String[] args) {
		multi m = (int a, int b) -> {
			return a * b;
		};
		
		System.out.println( m.multiply(1, 2));
	}

}
