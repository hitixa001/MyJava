package JavaSessions;

public class MethodsAssignments {

	public static void main(String[] args) {

		System.out.println("the sum of two numbers: "+ sum(10, 30));
		System.out.println("the product of two number are: "+product(6, 8));
		System.out.println("the circrumference of circle is: "+getCircumferenceOfCircle(2));
		System.out.println("the area of circle is: "+getAreaOfCircle(3));
		
		System.out.println(isPrime(5));
		System.out.println(isPrime(10));
		System.out.println(fact(5));
		System.out.println(fact(10));
		System.out.println(fact(1));
		System.out.println(fact(0));
		System.out.println("Largest of 3 numbers 10, 20 & 30 is: "+maximum(10, 20, 30));
		
		System.out.println("Smallest of 3 numbers 10, 20 & 30 is: " + minimum(100,200,300));

		System.out.println("the number is odd: "+Even_Odd(15));
	//	System.out.println("the number is even: "+Even_Odd(0));
		System.out.println("Joe is eligible to vote : "+vote(20));
		grade(60);

	}

	// 1.
	public static int sum(int i, int j) {
		int c = i+j;
		return c;
	}

	// 2.Define a method that returns the product of two numbers entered by user.
	public static int product(int i, int j) {
		int c = i*j;
		 return c;

	}

	// 3.
	public static double getCircumferenceOfCircle(int radius) {
		double Circumference= 2*3.14*radius;
		return Circumference;
		}
	
	public static double getAreaOfCircle(int radius) {
		double area= 3.14*(radius*radius);
		return area;
		}

	// 4.maximum and the minimum number respectively among three numbers
	public static int maximum(int a, int b, int c) {
		if (a>b && a>c) {
			return a;
		}

		if (b > c) {
			return b;
		}

		return c;
	}

	public static int minimum(int a, int b, int c) {
		if (a<b && a<c) {
			return a;
		}

		if (b < c) {
			return b;
		}

		return c;
	}

	// 5.
	public static boolean Even_Odd(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 6.
	public static boolean vote(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

	// 7.
	public static boolean isPrime(int x) {
		boolean prime = true;
		if (x > 1) {
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}

	// 8.
	public static void grade(int marks) {
		if (marks >= 91) {
			System.out.println("Your grade is AA");
		} else if ((marks >= 81) && (marks <= 90)) {
			System.out.println("Your grade is AB");
		} else if ((marks >= 71) && (marks <= 80)) {
			System.out.println("Your grade is BB");
		} else if ((marks >= 61) && (marks <= 70)) {
			System.out.println(" Your grade is BC");
		} else if ((marks >= 51) && (marks <= 60)) {
			System.out.println(" Your grade is CD");
		} else if ((marks >= 41) && (marks <= 50)) {
			System.out.println(" Your grade is DD");
		} else if (marks <= 40) {
			System.out.println(" Sorry you have FAILED");
		}
	}

	// 9.
	public static int fact(int x) {
		if (x == 0 || x == 1) {
			return 1;
		} else {
			return fact(x - 1) * x;
		}
	}

}