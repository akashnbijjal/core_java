package Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AverageTopScoreBySubjectProblem {
public static void main(String[] args) {
	  List<Student> students = Arrays.asList(
	            new Student("Alice", Arrays.asList(90, 85, 92)),
	            new Student("Bob", Arrays.asList(88, 91, 84)),
	            new Student("Charlie", Arrays.asList(95, 89, 88)),
	            new Student("David", Arrays.asList(82, 90, 86))
	        );
	  
	  Map<String, Double> averagescore=students.stream().map(
	  
}
}
