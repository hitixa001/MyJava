package Assignments;

public class StringManipulation {

	public static void main(String[] args) {
		//1.
		String s = "October";
		String s1 = "October";
		if(s.equals(s1)) {
			System.out.println("string 's' and 's1' both are equal");
		}else {
		System.out.println("string 's' and 's1' both are NOT equal");
		}
		
		//2.
		String h = "      Hello Everyone           ";
		System.out.println(h.trim().replace(" ", ""));
		
		//3.
		String j = "Selenium";
		System.out.println(j.charAt(0));
		System.out.println(j.charAt(j.length()-1));
		
		//4.
		String v = "Address Verification";
		if(v.indexOf("Verification")>0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//5.
		String name = "Hitixa";
//		StringBuffer n = new StringBuffer("Hitixa");
//		System.out.println(n.reverse());
		System.out.println(new StringBuilder(name).reverse().toString());
		
		//6.
		String l = "The Caller ID number is 6789";
		System.out.println(l.substring(l.indexOf("is")+3, l.length()));

		//7.
		String s2 = "Welcome to Naveen automationLabs";
		System.out.println(s2.indexOf("a",s2.indexOf("a")+ s2.indexOf("a")-1)); //23 
		
		//this should give me 14 but its printing 6 dont know why??????
		//please explain...............why is it like this? 
		System.err.println(s2.indexOf("e",s2.indexOf("e")+ s2.indexOf("e")+ 1));	
		
		//8.
		String m = "This is my Java code";
		System.out.println(m.indexOf("MY"));
		
		//9.
		String str = "Java;Is;Recommended;Language;For;Software;Automation";
		for(int i = 0; i<str.split(";").length; i++) {
			System.out.println(str.split(";")[i]);
		}
		
		//10.
		String w = "Hello! Good Morning";
		System.out.println(w.substring(w.length()/2-2,w.length()/2+2));
	}

	
}
