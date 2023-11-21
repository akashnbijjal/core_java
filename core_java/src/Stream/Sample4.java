package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample4 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Alice", Arrays.asList("apple", "apricot")),
				new Person("Bob", Arrays.asList("banana", "blueberry")),
				new Person("Charlie", Arrays.asList("cherry", "coconut")));

		// by using map
		List<List<String>> l = people.stream().map(p -> p.getFruits()).collect(Collectors.toList());

		System.out.println(l + "----------->" + "by using map");

		List<String> l1 = people.stream().flatMap(person -> person.getFruits().stream()).collect(Collectors.toList());

		System.out.println("         ");
		System.out.println(l1);

	}
}
