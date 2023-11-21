package Stream;

import java.util.TreeMap;

public class Maps07 {

	public static void main(String[] args) {

		String input = "The quick brown Fox, jumps over the lazy dog. The dog barks, and the fox runs away!";
		String st[] = input.split("\\s+");

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		for (String word : st) {
			word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
			treeMap.put(word, word.length());

		}
		System.out.println(treeMap);
		
		treeMap.entrySet().forEach(entry->
		System.out.println(entry.getKey()+"--->"+entry.getValue())
				);
	}

}
