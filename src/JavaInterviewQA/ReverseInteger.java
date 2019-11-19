package JavaInterviewQA;

public class ReverseInteger {

	public static void main(String[] args) {

		// 1. using proper algorithm
		long num = 123456789;
		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		// print only out of whileLoop()
		System.out.println("Reverse number is---> " + rev);

		
		// 2.using StringBuffer
		long num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

	
	
}
