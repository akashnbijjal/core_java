package Stream;

import java.util.Arrays;
import java.util.List;

public class Streams2 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	
	
	int result=numbers.stream().filter(n->n%2==0).map(n->n*n).reduce(0, (acc, n) -> acc + n);
	System.out.println(result);
}
}
