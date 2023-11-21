package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap2 {
	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "banana", "cherry");

		// convert to uppercase
		List<String> l = fruits.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
		System.out.println(l);

		// Another method
		List<String> l1 = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(l1);

	}
}
