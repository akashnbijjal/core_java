package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapfilter {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<>();
		l.add(3);
		l.add(5);
		l.add(1);
		l.add(8);
		l.add(4);
		
		
		List<Integer>l1=l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l1);
		
		
		List<Integer>l2=l.stream().flatMap(i-> Stream.of(i+5)).collect(Collectors.toList());
		System.out.println(l2);
		
		
		
	}
	
}
