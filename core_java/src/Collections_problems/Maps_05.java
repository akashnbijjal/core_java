package Collections_problems;

import java.util.LinkedHashMap;

public class Maps_05 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 2, 3, 1, 1 };

		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (linkedHashMap.containsKey(arr[i])) {
				Integer integer = linkedHashMap.get(arr[i]);
				linkedHashMap.put(arr[i], integer + 1);
			} else {
				linkedHashMap.put(arr[i], 1);
			}
		}
		System.out.println(linkedHashMap);

	}
}
