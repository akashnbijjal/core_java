package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Arrays1 {
	public static void main(String[] args) {

		Integer[] arr = { 5, 9, 2, 8, 3, 7 };

		List<Integer> list = Arrays.asList(arr);

		int secondleast = list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
		int firstleast = list.stream().sorted(Comparator.naturalOrder()).findFirst().get();

		// System.out.println(secondleast+firstleast);
		System.out.println(firstleast);

		// list of elements in a sorted order
		List<Integer> sortedorder = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedorder);
		
		for (Integer integer : sortedorder) {
			System.out.print(integer+" ");
			
		}
	}
}
