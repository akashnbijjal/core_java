package Arrays01;

import java.util.HashMap;
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {

		String s = "fears to leads to anger anger leads to hatred hatred leads to conflict leads to suffering";

		String st[] = s.split(" ");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		for (int i = 0; i < st.length; i++) {

			if (hashMap.containsKey(st[i])) {
				Integer integer = hashMap.get(st[i]);
				hashMap.put(st[i], integer + 1);
			} else {
				hashMap.put(st[i], 1);
			}
		}

		System.out.println(hashMap);
	}
}
