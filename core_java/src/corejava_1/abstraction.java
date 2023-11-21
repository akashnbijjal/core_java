package corejava_1;


interface Addition{
	public int sum(int a,int b);
}
class impl implements Addition{

	@Override
	public int sum(int a,int b) {
		
		return a+b;
	}
	
}


public class abstraction {
public static void main(String[] args) {
	impl i=new impl();
	
	System.out.println(i.sum(2, 3));
}
}
