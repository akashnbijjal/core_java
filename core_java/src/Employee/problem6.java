package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class problem6 {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "shiva", 101, "active", 2000));
		emp.add(new Employee(102, "reddy", 101, "active", 5000));
		emp.add(new Employee(103, "raju", 102, "inactive", 6000));
		emp.add(new Employee(104, "shivam", 102, "inactive", 4000));
		emp.add(new Employee(105, "bob", 103, "active", 3500));
		emp.add(new Employee(106, "alice", 103, "inactive", 3500));
		emp.add(new Employee(107, "srinu", 104, "active", 3500));

		// second minimum salary
		Optional<Employee> list = emp.stream().sorted(Comparator.comparingInt(Employee::getSalary)).skip(1).findFirst();

		System.out.println("second minimum salary");
		System.out.println("-------------------------------");
		list.ifPresent(System.out::println);

		System.out.println("-------------------------------");

		System.out.println("second maximum salary");
		System.out.println("-------------------------------");

		Optional<Employee> list1 = emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1)
				.findFirst();
		list1.ifPresent(System.out::print);

	}
}
