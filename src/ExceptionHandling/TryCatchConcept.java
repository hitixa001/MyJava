package ExceptionHandling;

public class TryCatchConcept {

	String name = "tom";
	public static void main(String[] args) {
		
		TryCatchConcept obj = new TryCatchConcept();
		
		System.out.println("a");
		System.out.println("b");
		
		//JVM will throw an exception with the help of: 1. it will create the object of exception class.
		//2. it will print the exception info with the help of stack trace and exception handler.
		//exception: java.lang.ArithmeticException(no number can be divide by 0) and the programme will be terminated.
		//to avoid this exception we use try-catch block.
		try {
			//obj = null;
			System.out.println(obj.name);
		int i = 9/0;	
		}catch(ArithmeticException e) {
			//its just an information about exception
			System.out.println("exception occurred");
			e.printStackTrace();	//it will print information about exception
			System.out.println(e.getMessage()+ "exception occurred");	// / by zeroexception occurred
		}catch(NullPointerException n) {		//multiple catch block is possible but single try block
			System.out.println(n.getMessage()+"nullpointer exception");
		}
		
		
		System.out.println("c");
		
	}

}
