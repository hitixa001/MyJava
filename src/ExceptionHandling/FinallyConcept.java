package ExceptionHandling;

public class FinallyConcept {

	public static void main(String[] args) {
		
//		System.out.println("a");
//		
//		try {
//			int i = 9/3;
//			
//		}catch(Exception e) {
//			System.out.println("exception");
//		}
//		finally {	//finally block will always be executed.
//			System.out.println("test");
//		}
		
		int p = 20;
		try {
			System.out.println("in side the try block");
			int t = p/0; 
		}catch(NullPointerException e) { 		// it wont print this because its a NullPointerException and we are getting ArithmeticException.
			System.out.println("inside the catch block");
			System.out.println("null pointer is coming");
		}finally {
			System.out.println("inside the finally ");
		}
		
	}

}
