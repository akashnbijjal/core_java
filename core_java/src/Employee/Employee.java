package Employee;

public class Employee {

	private int empid;
	private String empname;
	private int deptid;
	private String status="Active";
	private int salary;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, int deptid, String status, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deptid = deptid;
		this.status = status;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", deptid=" + deptid + ", status=" + status
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	
}
