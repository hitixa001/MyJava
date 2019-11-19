package ExceptionHandling;

public class ThrowConcept {

	public static void main(String[] args) {
		
	//Throw key word is use to deliberately generate your own exception.	
		try {
			throw new Exception("this is my excepetion");
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		String colVal = null;
		if(colVal==null) {
			try {
				throw new Exception("columnValueNotFoundExpetion");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
