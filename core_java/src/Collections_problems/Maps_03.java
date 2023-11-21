package Collections_problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Maps_03 {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
	map.put("A", 1);
	map.put("B", 2);
	map.put("C", 2);
	map.put("D", 3);
	
	
	//remove all the duplicate values
	
	Set<Integer> set=new HashSet<Integer>();
	
	map.values().removeIf(value->!set.add(value));
	System.out.println(map);
	
	
	
}
}
