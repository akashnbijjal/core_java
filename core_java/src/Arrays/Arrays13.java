package Arrays;

public class Arrays13 {
public static void main(String[] args) {
	//find the largest element in the array
	
	int [] arr= {2,3,4,5,6,7};
	
	int largest=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>arr[0])
		{
			largest=arr[i];
		}
	}
	System.out.println(largest);
}
}
