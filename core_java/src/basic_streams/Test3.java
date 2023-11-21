package basic_streams;

import java.util.TreeMap;

public class Test3 {
	public static void main(String[] args) {

		String s = "fears to leads to anger anger leads to hatred hatred leads to conflict leads to suffering";

		String[] st = s.split("\\s+");
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		for (int i = 0; i < st.length; i++) {
			if (treeMap.containsKey(st[i])) {
				Integer integer = treeMap.get(st[i]);
				treeMap.put(st[i], integer + 1);
			} else {
				treeMap.put(st[i], 1);
			}
		}
		System.out.println(treeMap);
		
		
	
		
		
	}
}
