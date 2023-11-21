package Collectors;

import java.util.Arrays;
import java.util.List;

public class Collections5 {
public static void main(String[] args) {
	
	List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
	

	long startswithb=colors.stream().filter(color->color.startsWith("B")).count();
	System.out.println("Number of letters "+startswithb);
	
	
	long startswithy=colors.stream().filter(color->color.startsWith("Y")).count();
	System.out.println("Number of letters "+startswithy);
	
}
}
