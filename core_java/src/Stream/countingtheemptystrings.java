package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class countingtheemptystrings {
public static void main(String[] args) {
	List<String>list=Arrays.asList("java","","coding","","learning");
	long count=list.stream().filter(e1->e1.isEmpty()).collect(Collectors.counting());
	System.out.println(count);
}
}
