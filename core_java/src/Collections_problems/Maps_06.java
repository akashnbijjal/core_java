package Collections_problems;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps_06 {
	public static void main(String[] args) {
		String s = "fears  to leads to anger anger leads to hatred hatred leads to conflict leads to suffering";

		String st[] = s.split("\\s+");
		
//		TreeSet<String> set = new TreeSet<String>();
//		for (int i = 0; i < st.length; i++) {
//			set.add(st[i]);
//		}
//		System.out.println(set);
		
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>();
		
		for (int i = 0; i < st.length; i++) {
			if(treeMap.containsKey(st[i])) {
				Integer integer=treeMap.get(st[i]);
				treeMap.put(st[i], integer+1);
			}
			else {
				treeMap.put(st[i], 1);
			}
		}
		System.out.println(treeMap);

	}
}
