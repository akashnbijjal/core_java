package Array_Search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		int arr[] = { 10, 10, 10, 20, 30, 40, 50, 40, 20 };

		Map<Integer, Long> maps = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(maps);
		maps.forEach((element, count) -> {

			if (count > 1) {
				System.out.println(element);

			}

		});

	}
}
