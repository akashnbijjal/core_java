package Lamba;

interface interef {
	public void add(int a, int b);
}

class demo implements interef {

	@Override
	public void add(int a, int b) {
		System.out.println("the sum: " + (a + b));

	}

}

public class Test {
public static void main(String[] args) {
//	interef i=new demo();
//	i.add(10, 20);
	
	//by using lambda expression
	
	interef i1=(a,b)->{
		int sum=(a+b);
		System.out.println(sum);
	};
	i1.add(10, 20);
	
}
}
