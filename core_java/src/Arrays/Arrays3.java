package Arrays;

public class Arrays3 {
public static void main(String[] args) {
	int no=6;
	
	int []arr= {2,4,6,3,8,9};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if (arr[i]%2==0&&arr[j]%2==0) {
				System.out.print(arr[i]+" "+arr[j]);
				System.out.println();
			}
		}
	}
}
}
