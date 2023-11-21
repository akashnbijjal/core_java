package Array_Search;

public class sample2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		int item = 6;
		int beg = 0;
		int end = arr.length - 1;
		int mid = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			mid = (beg + end) / 2;
			if (mid == item) {
				flag = true;
			} else if (mid > item) {
				end = mid - 1;
			} else {
				beg = mid + 1;
			}
		}

		if (flag) {
			System.out.println("Item found");
		} else {
			System.out.println("Item not found");
		}
	}
}
