package Collections_problems;

import java.util.HashMap;

public class Maps_02 {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 92);
		scores.put("Carol", 78);
		
		
		//remove score less than 80
		
		scores.entrySet().removeIf(entry->entry.getValue()<80);
		System.out.println(scores);
	}
}
