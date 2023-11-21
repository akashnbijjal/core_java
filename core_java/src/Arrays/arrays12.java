package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrays12 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int count = 0;

//		for (int i = 0; i < arr.length; i++) {
//
//			count = count + arr[i];
//		}
//		System.out.println(count);

		// by converting arrays to List
//		
//		List<Integer> list = Arrays.asList(arr);
//		int sumofelements = list.stream().collect(Collectors.summingInt(Integer::intValue));
//		System.out.println(sumofelements);

		
		//by using arrays.sum()
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}
