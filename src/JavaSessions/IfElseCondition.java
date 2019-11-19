package JavaSessions;

public class IfElseCondition {

	public static void main(String[] args) {
		// assignment:
		// 1.
		int x = 100;
		int y = 200;
		int z = 300;
		//&& is known as shot circuit operator in java. here both(left & right side) the condition should be satisfied .
		if (x > y && x > z) {
			System.out.println("The greatest: " + x); 
		} else if (y > z) {
			System.out.println("The greatest: " + y);
		} else {
			System.out.println("The greatest: " + z);
		}
		
		//if all the 3 values are same this is how you do it.
		int i = 300;
		int j = 300;
		int k = 300;
		if (i > j && i > k) {
			System.out.println("The greatest: " + i); 
		} else if (j > k) {
			System.out.println("The greatest: " + j);
		} else if(k==i && k==j ){
			System.out.println("all the values are equal");
		}
		

		// 2.
		int a = 101;
		int b = 99;
		int c = 900;
		int d = 1000;
		if (a == b) {
			System.out.println("The greatest: " + a);
		} else if (b >= c) {

			System.out.println("The greatest: " + b);
		} else if (c >= d) {

			System.out.println("The greatest: " + c);
		} else {
			System.out.println("The greatest: " + d);
		}
		// 3.
		int n = 35;
		if (n > 0) {
			System.out.println(n + " --is positive value");
		}

		int m = -11;
		if (m < 0) {
			System.out.println(m + " --is negative value");
		}
		// 4.
		String s = "canada";
		if (s.equals("India")) {
			System.out.println("Delhi");
		} else if (s.equals("UK")) {
			System.out.println("London");
		} else if (s.equals("France")) {
			System.out.println("Paris");
		} else if (s.equals("Switzerland")) {
			System.out.println("Bern");
		} else if (s.equals("Italy")) {
			System.out.println("Rome");
		} else if (s.equals("USA")) {
			System.out.println("Washington, D.C.");
		} else if (s.equals("Brazil")) {
			System.out.println("Brasilia");
		} else if (s.equals("Portugal")) {
			System.out.println("Lisbon");
		} else if (s.equals("China")) {
			System.out.println("Beijing");
		} else if (s.equals("Thailand")) {
			System.out.println("Bangkok");
		} else {
			System.out.println("No country is defined with country name");
		}
		// 5.
		int age = 18;
		if (age >= 18) {
			System.out.println("eligible for vote");
		} else {
			System.out.println("not eligible for vote");
		}
	}
}
