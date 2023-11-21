package Arrays;

public class Arrays11 {
public static void main(String[] args) {
	int []arr= {10,20,30,40,50,60,70};
	int sum=0;
	//first to middle
	for(int i=0;i<arr.length/2;i++)
	{
		sum=sum+arr[i];
		
	}
	System.out.print(sum);
}
}
