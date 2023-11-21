package Fruit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class problem3 {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("Apple", 55, 25, "Red"));
		list.add(new Fruit("banana", 105, 50, "yellow"));
		list.add(new Fruit("orange", 80, 20, "orange"));
		list.add(new Fruit("mango", 90, 35, "yellow"));
		list.add(new Fruit("watermelon", 200, 35, "green"));
		list.add(new Fruit("sapota", 25, 15, "brown"));

		List<Fruit> list1 = list.stream().sorted(Comparator.comparingInt(Fruit::getPrice)).collect(Collectors.toList());
		list1.forEach(System.out::print);

	}
}
