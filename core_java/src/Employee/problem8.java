package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class problem8 {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "shiva", 101, "active", 2000));
		emp.add(new Employee(102, "reddy", 101, "active", 5000));
		emp.add(new Employee(103, "raju", 102, "inactive", 6000));
		emp.add(new Employee(104, "shivam", 102, "inactive", 4000));
		emp.add(new Employee(105, "bob", 103, "active", 3500));
		emp.add(new Employee(106, "alice", 103, "inactive", 3500));
		emp.add(new Employee(107, "srinu", 104, "active", 3500));

		double salaryThreshold = 4000;

		//: Find and print the names of employees whose salary is greater than a given threshold.
		
		List<Employee> list = emp.stream().filter(p -> p.getSalary() > salaryThreshold).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
