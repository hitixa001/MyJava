package JavaInterviewQA;

public class ReverseString {

	public static void main(String[] args) {
		
		//String is a immutable  object so we dont have 'reverse' function in string.
		String s = "Selenium";
		
		//using forLoop:
//		for(int i= s.length()-1; i>=0; i--) {
//			System.out.print(s.charAt(i));
//		}
		
		//using StringBuffer:
		StringBuffer s1 = new StringBuffer(s);
		System.out.println(s1.reverse());
		
	}

}
