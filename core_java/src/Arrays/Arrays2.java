package Arrays;

import java.util.Scanner;

public class Arrays2 {

	
	public static void main(String[] args) {
		int k=12;
		
		int []arr= {2,4,6,3,8,9};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]*arr[j]==k)
				{
					System.out.println(arr[i]+" "+arr[j]);
					
				}
			}
		}
	}
}
