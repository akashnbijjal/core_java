package Stream;

import java.util.ArrayList;
import java.util.Collections;


public class max1 {
public static void main(String[] args) {
	ArrayList<Integer>l=new ArrayList<>();
	l.add(0);
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(25);
	
	Integer max=Collections.min(l,Collections.reverseOrder());
	System.out.println(max);
}
}
