package corejava_1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int result=1;
		for(int i=no;i>0;i--)
		{
			
		result=result*i;	
		}
		System.out.println(result);
	}
	
}
