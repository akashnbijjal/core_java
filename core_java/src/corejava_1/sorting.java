package corejava_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sorting {

	public static void main(String[] args) {

		
		Integer [] a= {3,2,1,7,8};
		//List<Integer>list=Arrays.stream(a).sorted().boxed().collect(Collectors.toList());
		System.out.println(Arrays.sort(a));
		
		List<Integer>list=Arrays.asList(a);
		List<Integer>l=list.stream().sorted().collect(Collectors.toList()); //Ascending order
		System.out.println(l);
		
		List<Integer> l1=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l1);//descending order
		
		
		int l2=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(l2);//second highest number
		
	}
}
