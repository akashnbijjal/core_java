package Collections_problems;

import java.util.HashMap;
import java.util.Map;

public class Maps_01 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");
		map.put(4, "jkl");
		map.put(5, "mno");

		System.out.println(map);

		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -----> " + entry.getValue()));

	}

}
