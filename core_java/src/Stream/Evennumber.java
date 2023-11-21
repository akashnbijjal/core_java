package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Evennumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		
//		System.out.println(list2);
//		
//		for (Integer integer : list2) {
//			System.out.println(integer);
//		}

	}
}
