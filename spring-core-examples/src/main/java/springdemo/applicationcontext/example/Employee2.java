package springdemo.applicationcontext.example;

public class Employee2 {

	private int empId;

	private String empName;

	private String empDepartment;

	public Employee2(int empId, String empName, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}

	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}

}
