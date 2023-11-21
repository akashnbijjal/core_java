package Collections_problems;

import java.util.LinkedHashMap;

public class Maps_04 {
	public static void main(String[] args) {
		String s = "mississippi";

		LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(linkedHashMap.containsKey(ch))
			{
				Integer integer=linkedHashMap.get(ch);
				linkedHashMap.put(ch, integer+1);
			}else {
				linkedHashMap.put(ch, 1);
			}
		}
		
		System.out.println(linkedHashMap);
	}
}
