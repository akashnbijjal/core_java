package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountProblem {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple", "apple", "banana");
		
		//Count the number of occurrences of each word in a list of strings
		Map<String, Long> word=words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(word);
		
	}
}
