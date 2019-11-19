package ExceptionHandling;

public class ThrowsConcept {

	public static void main(String[] args) {
		
		ThrowsConcept m = new ThrowsConcept();
		try {
			m.m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("test");
	}
	
	public void m1() throws Exception {
		m2();
	}
	
	public void m2() throws Exception{
		int i = 9/0;
	}

}
