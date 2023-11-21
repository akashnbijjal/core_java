package Arrays;

public class Arrays6 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1 };
		boolean flag = false;
		int no = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					no=arr[i];
				}
			}
		}
		System.out.println(flag);
		System.out.println(no);
	}
}
