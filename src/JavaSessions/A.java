package JavaSessions;

public class A {

	public static void main(String[] args) {
		
		//can i call different main methods with different classes -- yes we can do that
		
		B.main(args);
		System.out.println("A MAIN METHOD");

	}

}
