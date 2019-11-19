package JavaSessions;

public class MainMethodOverloading {

	// but java(jvm) will always call for this main method
	// this is just a concept practically we don't use main method overloading.
	public static void main(String[] args) {

		main(10);
		
	}

	// we can always overload main method.
	public static void main(int a) {
		System.out.println(a);
		main(30, 25); // here we are calling 3rd main method

	}

	public static void main(int a, int b) {
		System.out.println(a * b);
		System.out.println(a + b);

	}

	//HERE THESE ARE TWO DIFFERENT METHODS ITS NOT METHOD OVERLOADING AND THIS IS TOTALLY WRONG APROACH.
//	public void login() {
//
//	}
//
//	public static void login(int OTP) {
//
//		}

}
