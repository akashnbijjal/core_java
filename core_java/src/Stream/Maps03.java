package Stream;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Maps03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "fears to leads to anger anger leads to hatred hatred leads to conflict leads to suffering";

		TreeSet<String> set = new TreeSet<String>();
		String st[] = s.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
		}
		// fears to leads to anger anger leads to hatred hatred leads to conflict leads
		// to suffering
		System.out.println(set);
		TreeMap<String, Integer> hashMap = new TreeMap<>();

		for (int i = 0; i < st.length; i++) {
			if (hashMap.containsKey(st[i])) {
				Integer integer = hashMap.get(st[i]);
				hashMap.put(st[i], integer + 1);
			} else {
				hashMap.put(st[i], 1);
			}
		}
		System.out.println(hashMap);
		sc.close();
	}
}
