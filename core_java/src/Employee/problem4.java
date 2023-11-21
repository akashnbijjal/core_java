package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class problem4 {
public static void main(String[] args) {
	
	List<Employee> emp=new ArrayList<>();
	emp.add(new Employee(101,"shiva",101,"active",2000));
	emp.add(new Employee(102,"reddy",101,"active",5000));
	emp.add(new Employee(103,"raju",102,"inactive",6000));
	emp.add(new Employee(104,"shivam",102,"inactive",4000));
	emp.add(new Employee(105,"bob",103,"active",3500));
	emp.add(new Employee(106,"alice",103,"inactive",3500));
	emp.add(new Employee(107,"srinu",104,"active",3500));
	
	//wap to get max and min salary
	
	Employee l=emp.stream().max((i1,i2)->i1.getSalary()>i2.getSalary() ?1:-1).get();
	System.out.println(l);
	
	Employee l2=emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
	System.out.println(l2);
	
	Employee l1=emp.stream().min((i1,i2)->i1.getSalary()>i2.getSalary() ?1:-1).get();
	System.out.println(l1);
	
	

	
}
}
