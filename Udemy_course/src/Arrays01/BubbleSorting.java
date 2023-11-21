package Arrays01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSorting {
	public static void main(String[] args) {
		int arr[] = { 6, 3, 0, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int secondhighestelement = list.stream().sorted().skip(1).findFirst().get();
		System.out.println(secondhighestelement);

	}
}
