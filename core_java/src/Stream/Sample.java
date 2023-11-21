package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<>();
		l1.add(0);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		
		List<Integer>l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		for (Integer integer : l2) {
			System.out.println(integer);
		}
		
	}
	
	
}
