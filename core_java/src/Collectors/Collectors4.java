package Collectors;

import java.util.Arrays;
import java.util.List;

public class Collectors4 {
public static void main(String[] args) {
	List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	
	
	
	int evensum=numbers.stream().filter(p->p%2==0).mapToInt(Integer::intValue).sum();
	System.out.println("sum of evennumbers : "+evensum);
	
	
	int oddsum=numbers.stream().filter(p->p%2!=0).mapToInt(Integer::intValue).sum();
	System.out.println("sum of oddnumbers : "+oddsum);
	
	double evenavg=numbers.stream().filter(p->p%2==0).mapToDouble(Integer::doubleValue).average().getAsDouble();
	System.out.println("average of even numbers :"+evenavg);
	
}
}
