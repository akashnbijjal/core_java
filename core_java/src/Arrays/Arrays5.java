package Arrays;

public class Arrays5 {
public static void main(String[] args) {
	
	
	int []arr= {3,1,5,4,2};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(Math.abs(arr[i]-arr[j])==2 )
			{
				System.out.print(arr[i]+" "+arr[j]);
				System.out.println();
			}
		}
	}
}
}
