package Collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Collectiors2 {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 6);
		LinkedList<Integer> l = integers.stream().filter(x -> x > 2).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(l);

	}
}
