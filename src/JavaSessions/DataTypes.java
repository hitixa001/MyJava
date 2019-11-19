package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {

		// 1.
		System.out.println("*********1*********");
		String str = "Hello";
		String str1 = "Hitixa";
		System.out.println(str);
		System.out.println(str1);

		// 2.
		System.out.println("*********2*********");
		byte b = 74;
		byte b1 = 36;
		System.out.println(b + b1);

		// 3.
		System.out.println("*********3*********");
		short s = 50 / 3;
		System.out.println(s);
		// System.out.println(50/3);

		// 4.
		System.out.println("*********4*********");
		int a = -5 + 8 * 6;
		System.out.println(a);
		/*
		 * int a1 = -5+8; int a2 = 6; System.out.println(a1*a2);
		 */
		int b2 = 55 + 9;
		int b3 = 9;
		System.out.println(b2 % b3);
		// System.out.println((55 + 9) % 9);

		int c = 20 + -3 * 5 / 8;
		System.out.println(c);

		int d = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(d);

		// 5.
		System.out.println("*********5*********");
		double d1 = 25.5 * 3.5 - 3.5 * 3.5;
		double d2 = 40.5 - 4.5;
		System.out.println(d1 / d2);
		// System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

	}

}
