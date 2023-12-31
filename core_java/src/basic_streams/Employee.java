package basic_streams;

public class Employee {
	String name;
	int eno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public Employee(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eno=" + eno + "]";
	}

}
