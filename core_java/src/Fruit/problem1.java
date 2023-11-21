package Fruit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class problem1 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("Apple", 55, 25, "Red"));
		list.add(new Fruit("banana", 105, 50, "yellow"));
		list.add(new Fruit("orange", 80, 20, "orange"));
		list.add(new Fruit("mango", 90, 35, "yellow"));
		list.add(new Fruit("watermelon", 200, 35, "green"));
		list.add(new Fruit("sapota", 25, 15, "brown"));

		List<Fruit> sortedSet = list.stream().filter(p -> p.calories < 100)
				.sorted(Comparator.comparingInt(Fruit::getCalories).reversed()).collect(Collectors.toList());
		sortedSet.forEach(System.out::println);
		System.out.println("=================");
		System.out.println("alternate");
		System.out.println("=================");
		List<Fruit> list1 = list.stream().filter(a -> a.calories < 100)
				.sorted((p1, p2) -> (p2.calories < p1.calories) ? -1 : (p2.calories > p1.calories) ? 1 : 0)
				.collect(Collectors.toList());
		System.out.println(list1);
	}
}
