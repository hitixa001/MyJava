package JavaSessions;

public class EmployeeTest {

	public static void main(String[] args) {
		
		EmployeeData e1 = new EmployeeData("Kate", 102, 25, "IT",2000);
		System.out.println(e1.EmpName + " "+ e1.age);
		
		e1.getEmployeeName();
		
		e1.setSalary(5000);
		System.out.println(e1.getSalary());
	}

}
