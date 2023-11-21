package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class findduplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3);

		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();

		for (Integer integer : numbers) {
			if (hashMap.containsKey(integer)) {
				Integer integer2 = hashMap.get(integer);
				hashMap.put(integer, integer2 + 1);

			} else {
				hashMap.put(integer, 1);
			}
		}
		System.out.println(hashMap);

	}
}
