package Leetcode;

import java.util.Arrays;

public class lengthofthelastword {
public static void main(String[] args) {
	String input="Hello World";
	String st[]=input.split(" ");
	System.out.println(Arrays.toString(st));
	
	System.out.println(st[st.length-1].length());
	
}
}
