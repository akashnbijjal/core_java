package basic_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class calculateaverage {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3);
		List<Integer> duplicates = numbers.stream()
		    .collect(Collectors.groupingBy(Integer::intValue)).entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		    
		System.out.println(duplicates);

	}
}
