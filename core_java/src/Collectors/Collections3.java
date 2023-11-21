package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collections3 {
public static void main(String[] args) {
	List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
	
	List<String> uppercase=colors.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println("Uppercase : "+uppercase);
	
	
	List<String> lowercase=colors.stream().map((String::toLowerCase)).collect(Collectors.toList());
	System.out.println("Lowercase : "+lowercase);
	
	
}
}
