package springdemo.applicationcontext.example;

public class Employee {

	private String employeeType;

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	public void print() {
		System.out.println("Employee : "+this.employeeType);
	}
	
	
	
}
