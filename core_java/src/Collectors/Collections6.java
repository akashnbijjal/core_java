package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections6 {
public static void main(String[] args) {
	List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
	
	
	Set<Integer> set=nums.stream().collect(Collectors.toSet());
	System.out.println(set);
}
}
