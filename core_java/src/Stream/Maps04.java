package Stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Maps04 {
	
	public static void main(String[] args) {
		String input = "The quick brown Fox, jumps over the lazy dog. The dog barks, and the fox runs away!";

		//TreeSet<String> set = new TreeSet<>();
		String st[] = input.split("\\s+");
		HashMap<String, Integer> hashMap = new HashMap<>();

//		for(String words:st)
//		{
//			words=words.replaceAll("[^a-zA-Z^]", "").toLowerCase();
//			set.add(words);
//		}
//		System.out.println(set);
		
		 for (String word : st) {
	            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
	            
	            if (!word.isEmpty()) {
	                if (hashMap.containsKey(word)) {
	                    Integer count = hashMap.get(word);
	                    hashMap.put(word, count + 1);
	                } else {
	                    hashMap.put(word, 1);
	                }
	            }
	        }
		System.out.println(hashMap);

	}
}
