package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int no;
	String name;

	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

}

public class Sample3 {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1, "abc"));
		l.add(new Employee(2, "cbz"));
		l.add(new Employee(3, "jkl"));
		l.add(new Employee(4, "klm"));

		List<Employee> l1 = l.stream().filter(m -> m.name.length() > 2).collect(Collectors.toList());

		for (Employee employee : l1) {
			System.out.println(employee.no + " " + employee.name);
		}
	}
}
