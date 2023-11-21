package Collections_problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample1 {
public static void main(String[] args) {
	
	Set<String> set=new HashSet<String>();
	set.add("Alice");
	set.add("Bob");
	set.add("Carol");
	//HashSet doesn't follow any insertion and don't allow duplicate values
	System.out.println(set);
	set.forEach(System.out::println);
	

	System.out.println(	set.contains("Alice"));
	
	set.remove("Bob");
	System.out.println(set);
	
	
	System.out.println("-------------------------------------------");
	System.out.println("-------------------------------------------");
	
	Set<Integer>set1=new LinkedHashSet<>();
	set1.add(1);
	set1.add(5);
	set1.add(8);
	set1.add(2);
	set1.add(3);
	set1.add(null);
	//LinkedHashSet follows the insertion order and doesn't allow duplicates and also allows null values 
	System.out.println(set1);
	System.out.println("-------------------------------------------");
	System.out.println("-------------------------------------------");
	

	Set<Integer> set2=new TreeSet<Integer>();
	set2.add(10);
	set2.add(5);
	set2.add(0);
	set2.add(15);
	//TreeSet is follows sorted order and doesn't allow the duplicates and null values
//	set2.add(null); //Exception in thread "main" java.lang.NullPointerException
	set2.add(15);
	System.out.println(set2);
	
}
}
