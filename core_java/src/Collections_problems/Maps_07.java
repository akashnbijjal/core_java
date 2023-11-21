package Collections_problems;

import java.util.HashMap;

public class Maps_07 {
	public static void main(String[] args) {
		String input = "The quick brown Fox, jumps over the lazy dog. The dog barks, and the fox runs away!";

		String st[] = input.split("\\s+");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String word : st) {
			word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
			if (!word.isEmpty()) {
				if (hashMap.containsKey(word)) {
					Integer integer = hashMap.get(word);
					hashMap.put(word, integer + 1);
				} else {
					hashMap.put(word, 1);
				}
			}
		}
		System.out.println(hashMap);

	}
}
