package JavaSessions;

public class Company {

	//what is Encapsulation: to Encapsulate the data members. not only for variables not only for class, it is for both.
	//how to access them: by creating the public methods in the form of getter and setter. or by creating the public method where
	//in this public method where you are calling the this private method and give that public method to the end user.
	public String name;
	public int totalEmp;
	private int budget;
	private String projects;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalEmp() {
		return totalEmp;
	}
	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	
	
	
}
