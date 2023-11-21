package Fruit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class problem2 {
	public static void main(String[] args) {

		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("Apple", 55, 100, "Red"));
		list.add(new Fruit("banana", 105, 50, "yellow"));
		list.add(new Fruit("orange", 80, 20, "orange"));
		list.add(new Fruit("mango", 90, 35, "yellow"));
		list.add(new Fruit("watermelon", 200, 35, "green"));
		list.add(new Fruit("sapota", 25, 15, "brown"));
		list.add(new Fruit("StrawBerry", 68, 60, "Red"));

		List<Fruit> sorting = list.stream().sorted(Comparator.comparingInt(Fruit::getPrice).reversed())
				.collect(Collectors.toList());
		System.out.println("Reverse sorting based on price");
		System.out.println();
		System.out.println("==========================");
		System.out.println();
		for (Fruit fruit : sorting) {
			System.out.println(fruit);
		}
		System.out.println("==========================");

		System.out.println("sorting based on color");
		System.out.println();
		System.out.println("==========================");
		List<Fruit> color = list.stream().sorted((e1, e2) -> e1.color.compareTo(e2.color)).collect(Collectors.toList());
		for (Fruit fruit : color) {
			System.out.println(fruit);
		}

	}
}
