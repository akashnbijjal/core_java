package Arrays01;

class main2 {
	public static boolean input(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return false;
				}
			}
		}

		return true;

	}
}

public class checkuniqueelements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println(main2.input(arr));
	}

}
