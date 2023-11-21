package Stream;

import java.util.List;

public class Person {

	
	private String name;
	private List<String> fruits;
	public Person(String name, List<String> fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFruits() {
		return fruits;
	}
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	
	
}
