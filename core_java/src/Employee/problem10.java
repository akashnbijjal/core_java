package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class problem10 {
	public static void main(String[] args) {
//	List<String> words = Arrays.asList("apple", "banana", "Apple", "cherry", "banana", "Apple");
//	
//	List<String>list=words.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
//	list.forEach(System.out::println);
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "shiva", 101, "active", 2000));
		emp.add(new Employee(102, "reddy", 101, "active", 5000));
		emp.add(new Employee(103, "raju", 102, "inactive", 6000));
		emp.add(new Employee(104, "shivam", 102, "inactive", 4000));
		emp.add(new Employee(105, "bob", 103, "active", 3500));
		emp.add(new Employee(106, "alice", 103, "inactive", 3500));
		emp.add(new Employee(107, "srinu", 104, "active", 3500));

		Map<Integer,List<Employee>> list = emp.stream().filter(s -> "active".equals(s.getStatus())).collect(Collectors.groupingBy(Employee::getDeptid));
		list.entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
	}
}
