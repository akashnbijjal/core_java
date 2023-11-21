package corejava_1;

public class java1 {
	
	int i=m1();
	
	java1(){
		System.out.println("Constructor");
	}
	int m1() {
		System.out.println("m1-method");
		return 20;
	}
	{
		System.out.println("instance block");
	}
	
	
public static void main(String[] args) {
	java1 j=new java1();
}
}
