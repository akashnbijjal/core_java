package Arrays01;

class main {
	public static int input(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if((arr[i]*arr[j])%2==1)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		return 0;

	}
}

public class pairofarraysprouductisodd {
	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 9 };
		main.input(arr);

	}

}
