package Lamba;

interface Mul{
	public int multiple(int a,int b);
}



public class Sample3 {
public static void main(String[] args) {

  Mul m=(a,b)->a*b;
  
  System.out.println(m.multiple(3, 4));
	
	
}
}
