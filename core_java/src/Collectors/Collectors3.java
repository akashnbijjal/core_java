package Collectors;

import java.util.Arrays;
import java.util.List;

public class Collectors3 {
public static void main(String[] args) {
	 List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
	 
	 
	 double average=nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
	 System.out.println("Average : "+average);
	 
	 
	 
	 
	 
}
}
