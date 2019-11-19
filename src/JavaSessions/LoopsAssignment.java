package JavaSessions;

public class LoopsAssignment {

	public static void main(String[] args) {

		// 1.
		int b = 1;
		do {
			System.out.println("I am Batman");
			b++;
		} while (b <= 5);

		// 2.
		for (int c = 1; c <= 9; c++) {
			System.out.println("I am Batman " + c);
		}

		// 3.loops assignment using all three loops(while,for and do-while)
		int a = 10;
		while (a >= 1) {
			System.out.println(a--);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		int d = 10;
		do {
			System.out.println(d--);
		} while (d >= 1);

		// 4.
		int j = 1;
		while (j <= 10) {
			System.out.println("Hello World");
			j++;
		}

		// 5.
		int k = 7;
		int i = 1;
		while (i <= 10) {
			System.out.println(k + " X " + i + "=" + i * k);
			i++;
			if (i == 7) {
				System.out.println("multiplication of '7' is encountered");
				break;
			}

		}

	}

}
