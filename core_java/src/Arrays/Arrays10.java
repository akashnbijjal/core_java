package Arrays;

public class Arrays10 {
public static void main(String[] args) {
	int []arr= {10,20,30,40,50,60,70};
	//first to middle
	for(int i=0;i<arr.length/2;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	//middle to end
	for (int i = arr.length/2; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
