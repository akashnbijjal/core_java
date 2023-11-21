package corejava_1;

public class reverse {
	public static void main(String[] args) {
		String s="abc";
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.append(s));
		
		System.out.println("by using String builder");
		System.out.println(sb.reverse());
		System.out.println("-------------------");
//		System.out.println('a'+'b');
		
		//by convert string to char array
		char[] c=s.toCharArray();
		System.out.println("by using chararray");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
		
		
	
	}
}
