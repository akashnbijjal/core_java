package corejava_1;

class s1{
	private int x=5;
	
	public int get()
	{
		return x;
	}
	public void set(int x)
	{
		this.x=x;
	}
}


public class Sample {
public static void main(String[] args) {
	s1 s=new s1();
	System.out.println(s.get());
	
	s.set(2);
	System.out.print(s.get());
}
}
