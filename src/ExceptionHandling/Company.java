package ExceptionHandling;

public class Company {

	public static void main(String[] args) {
		
		int s = revenue();
		System.out.println(s);
		

	}
	
	public static int revenue() {
		
		try {
			int P = 1000;
			int T = P+200;
			int total = T/15;
		return total;
		} catch(Exception e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("finally");
			return 0;
		}
		
		//return 0;
	}

}
