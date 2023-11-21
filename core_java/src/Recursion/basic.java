package Recursion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 8, 2, 1 };

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
	}
}
