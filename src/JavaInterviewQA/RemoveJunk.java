package JavaInterviewQA;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "再见  Goodbye 012345";
		String s1 = "~@~@~@~~@ 01198638 *$*$*$*$*$ Selenium ~@~@~@~####";
		
		//regular-Expression[^a-zA-Z1-9]
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
