package JavaSessions;

public class EmployeeData {

	public String EmpName;
	public int EmpID;
	public int age;
	public String dept;
	private int salary;

	public EmployeeData(String empName, int empID, int age, String dept, int salary) {
		EmpName = empName;
		EmpID = empID;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	public void getEmployeeName() {
		System.out.println("get Emp name");
		getEmployeeBonus();
	}

	private void getEmployeeBonus() {
		System.out.println("get Emp Bonus");
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary= salary;
	}

	public static void main(String[] args) {

		EmployeeData e1 = new EmployeeData("Tom",101, 28, "IT", 1000);
		System.out.println(e1.EmpName);
		System.out.println(e1.salary);
		e1.getEmployeeName();
	}

}
