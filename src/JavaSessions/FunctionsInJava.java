package JavaSessions;

import java.util.ArrayList;

//functions and Methods both are same thing.
public class FunctionsInJava {
	// class methods - class properties

	public static void main(String[] args) {
		
		FunctionsInJava call = new FunctionsInJava();
		call.test();
		
		int add = call.add();
		System.out.println(add);
		
		int divide = call.division(10, 20);
		System.out.println(divide);
		
		ArrayList<String> n = call.getStudentNames("Sep");
		n.forEach((a)->System.out.println(a));
		
		String CN = call.getCapitalName("India");
		System.out.println(CN);
		System.out.println(call.getCapitalName("USA"));
		
		String days[] = call.weekDaysName();
		System.out.println(days[5] +" "+days[0]);
		for(String day: days) {
			System.out.println(day);
		}
		
		String DN = call.geHODName("Admin");
		System.out.println(DN);
		
	}

	// 1.no input no return
	// void - a function can not return any thing.
	public void test() {
		System.out.println("no input no return Method");
	}

	// 2.no input some return
	public int add() {
		System.out.println("no input some return Method ");
		int i = 10;
		int j = 20;
		int k = i + j;
		return k;
	}

	public String getTrainerlName() {
		System.out.println("Get Trainer Name");
		String name = "Naveen";
		return name;
	}

	public String[] weekDaysName() {
		System.out.println("WeekDay's name Method");
		String day[] = new String[7];
		day[0] = "SUNDAY";
		day[1] = "MONDAY";
		day[2] = "TUSEDAY";
		day[3] = "WEDNESDAY";
		day[4] = "THURSDAY";
		day[5] = "FRIDAY";
		day[6] = "SATURADY";
		return day;

	}

	// 3.some input some output
	public int division(int a, int b) {
		System.out.println("Division Method");
		int c = b / a;
		return c;
	}

	public String getCapitalName(String CountryName) {
		System.out.println("get Capital Method");
		if (CountryName.equals("India")) {
			return "New Delhi";
		} else if (CountryName.equals("USA")) {
			return "Washington DC";
		} else if (CountryName.equals("Japan")) {
			return "Tokyo";
		} else {
			return "Capital not found";
		}
	}

	public ArrayList<String> getStudentNames(String BatchName) {
		System.out.println("get Student Names Method");
		ArrayList<String> names = new ArrayList<String>();
		if (BatchName.equals("Sep")) {
			names.add("Sam");
			names.add("Danny");
			names.add("Peter");
			names.add("Tom");
		} else if (BatchName.equals("Aug")) {
			names.add("A");
			names.add("B");
		}
		return names;
	}

	public String geHODName(String deptName) {
		System.out.println("UserName Method");
		if (deptName.equals("CS")) {
			return "Naveen";
		} else if (deptName.equals("EE")) {
			return "Tom";
		} else {
			return null;
		}

	}
}
