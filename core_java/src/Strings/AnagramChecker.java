package Strings;

import java.util.Arrays;



public class AnagramChecker {
public static void main(String[] args) {
	String s1="listen";
	String s2="silent";
	
	s1=s1.replaceAll("\\s", "").toLowerCase();
	s2=s2.replaceAll("\\s", "").toLowerCase();
	boolean anagram=Arrays.equals(s1.chars().sorted().toArray(), s1.chars().sorted().toArray());
	if(anagram)
	{
		System.out.println("yes");
	}
}
}
