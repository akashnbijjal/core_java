package Leetcode;

public class PalindromicNumber {
    public static boolean isPalindrome(int x) {

       String s= Integer.toString(x);
       
       String reverse="";
       for(int i=s.length()-1;i>=0;i--)
       {
           char ch=s.charAt(i);
           reverse=reverse+ch;
       }
       System.out.println(reverse);
       if(reverse.equals(s))
       {
           return true;
       }else{
           return false;
       }
        
    }
    public static void main(String[] args) {
		int x=12;
		System.out.println(isPalindrome(x));
		
	}
}
