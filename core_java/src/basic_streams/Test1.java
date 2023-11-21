package basic_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(25);
		arrayList.add(5);
		arrayList.add(3);

//		System.out.println(arrayList);
//
//		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
//		Collections.sort(arrayList, c);
//		System.out.println(arrayList);
		
		
		List<Integer> list=arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
		list.forEach(System.out::println);

	}
}
