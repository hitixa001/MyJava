package ExceptionHandling;

public class StaticBlock {

	static {	//before the main method if we write static block it will print get printed prior to main method.
		System.out.println("inside the static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside the main method");
		
		

	}

}
