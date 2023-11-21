package Stream;

import java.util.HashMap;
import java.util.TreeSet;

public class Maps05 {

	public static void main(String[] args) {
		String input = "The quick brown Fox, jumps over the lazy dog. The dog barks, and the fox runs away!";

		String st[] = input.split("\\s+");
		TreeSet<String> set = new TreeSet<String>();
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (String word : st) {
			word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
			set.add(word);
		}
		System.out.println(set);

		for (String word : st) {
			word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
			if (hashMap.containsKey(word)) {
				Integer count = hashMap.get(word);
				hashMap.put(word, count+1);
			}else {
				hashMap.put(word, 1);
			}
		}
		System.out.println(hashMap);

	}

}
