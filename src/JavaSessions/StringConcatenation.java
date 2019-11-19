package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("the value of a and b is: "+a+b);
		System.out.println("the value of x and y is: "+(x+y));
		
		
		//interview question
		char c='a';
		char c1='b';
		System.out.println(c+c1); //195 whenever you add char ASCII value will be printed it will not be concatenated.
		//ASCII Range:	0-9: 48-57,	a-z: 97-122, A-Z: 65-90
	}

}
