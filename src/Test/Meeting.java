package Test;

//public access modifiers can be called any where(within the class, within the package, outside the package by subclass only & outside the package)
//private access modifiers can be called within the class only.
//default access modifiers can be called within the class and within the package only.
//protected access modifiers can be called within the class, within the package, outside the package by subclass only.

public class Meeting {
	
	public int id;
	private String pwd;		//private methods can not be accessed out side class
	
	int studentCount =100;	//default access modifier-->if you dont write anything in front of int (any public/private) then by default it will be consider as default variable.
	protected boolean isRecorded = true;	//protected -->
	
	
	public Meeting(int id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public void start() {
		System.out.println("Meeting start");
	}
	
	private void chat() {
		System.out.println("Meeting chat");
	}

	public static void main(String[] args) {
		
		Meeting m = new Meeting(123, "test1");
		System.out.println(m.id);
		System.out.println(m.pwd);
		m.start();
		m.chat();
		System.out.println(m.studentCount);
		System.out.println(m.isRecorded);
		

	}

}
