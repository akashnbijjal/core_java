package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class WordCountProblem2 {
public static void main(String[] args) {
	
	//Find and print the longest word from a list of strings.
	 List<String> words = Arrays.asList("apple", "banana", "cherry", "grapefruit", "kiwi");
	 
	 Optional<String> longestword=words.stream().max(Comparator.comparingInt(String::length));
	 System.out.println(longestword.get());
}
}
