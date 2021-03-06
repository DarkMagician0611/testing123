
public class Employee {
	private int empId;
	private double salary;
	private String empName;
	private String companyName;
	
	public Employee() {
		empId = 10;
		empName = "citi";
		salary = 1000;
		companyName = "citi LTD";
	}
	
	public Employee(int empId, String empName, double salary) {
		this();//constructor chaining
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(empName + "\t" + empId + "\t" + salary + "\t" + companyName);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(1200, "emp name1", 12000d);
		emp.display();
	}
}
