package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class problem2 {
public static void main(String[] args) {
	List<Employee> emp=new ArrayList<>();
	emp.add(new Employee(101,"shiva",101,"active",2000));
	emp.add(new Employee(102,"reddy",101,"active",5000));
	emp.add(new Employee(103,"raju",102,"inactive",6000));
	emp.add(new Employee(104,"shivam",102,"inactive",4000));
	emp.add(new Employee(105,"bob",103,"active",3500));
	emp.add(new Employee(106,"alice",103,"inactive",3500));
	emp.add(new Employee(107,"srinu",104,"active",3500));
	
	//wap to print emp details based on dept
	
	Map<Integer, Long> emp1=emp.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.counting()));
	System.out.println(emp1);
}
}
