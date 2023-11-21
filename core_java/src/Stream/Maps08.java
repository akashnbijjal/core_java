package Stream;

public class Maps08 {

	public static void main(String[] args) {
		String input = "A man, a plan, a canal, Panama";
		String s=input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		boolean flag=true;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				flag=false;
			}
		}
		
		if(flag)
		{
			System.out.println(input+" ----------> isPalindrome");
		}else {
			System.out.println("noPalindrome");
		}
	}

}
