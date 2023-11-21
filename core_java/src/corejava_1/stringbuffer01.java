package corejava_1;

public class stringbuffer01 {
public void m1(String s)
{
	System.out.println("string");
}
public void m1(StringBuffer sb)
{
	System.out.println("stringbuffer");
}
	
	public static void main(String[] args) {
stringbuffer01 sf=new stringbuffer01();
sf.m1("string");
sf.m1(new StringBuffer("stringbuffer"));
sf.m1(null);
}
}
