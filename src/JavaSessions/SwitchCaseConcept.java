package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		int i = 9;
		// int j = 9/0; // java.lang.ArithmeticException: / by zero
		// int j = 0/1; //0
		int j = 9 / 1;
		System.out.println(j); // 9

		int num = 40;
		switch (num) {
		case 10:
			System.out.println(10);
			break;		//breaking the case is very important here otherwise it will execute next value as well.
		case 20:
			System.out.println(20);
			break;
		case 30:
			System.out.println(30);
			break;
		case 40:
			System.out.println(40);
			break;
		case 50:
			System.out.println(50);
			break;
		default:
			System.out.println("number not found");			
			break;
		}

	}

}
