package basic_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "David", "Eve");

		List<String> list = names.stream().filter(i -> i.length()>3).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
