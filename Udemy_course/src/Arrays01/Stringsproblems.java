package Arrays01;

public class Stringsproblems {
	public static void main(String[] args) {
		String s = "gadag";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
		char ch=s.charAt(i);
		reverse=reverse+ch;
		}
		System.out.println(reverse);
		int c='A';
		System.out.println(++c);
		char ch[]= {'J','O','H','N','\0'};
		System.out.println(ch);
		if(s.equals(reverse))
		{
			System.out.println("This string is palindrome");
		}else {
			System.out.println("This string is not palindrome");

		}
	}
}
