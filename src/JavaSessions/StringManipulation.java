package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "This is my java code and i am so happy";
		System.out.println(str.length());		//to count the string length
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(35));
		//System.out.println(str.charAt(38));	//exception:  java.lang.StringIndexOutOfBoundsException
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("happy"));
		System.out.println(str.indexOf("hello"));	//-1 : when ever you use indexOf and that string is not available then it'll give you -1.
		System.out.println(str.indexOf("s"));	//first occurrence of "s" if you don't pass any index number it will be by default count from 0
		//System.out.println(str.indexOf("s", 4));	//second occurrence of "s" because of index number.	 but this is hard coded.
		System.out.println(str.indexOf("s", str.indexOf("s") +1)); //second occurrence, without hard coded value.
		//System.out.println(str.indexOf("s", str.indexOf("s") + str.indexOf("s")+1)); //homework
				
		String msg = "Welcome Admin";
		if(msg.indexOf("Admin")>0) {
			System.out.println("Pass");
		}else
		{
			System.err.println("Fail");	//to show the error it will print in red colour.
		}
		
		//comparing two Strings:	String are case sensitive. so if Strings are not same then it'll give you false.
		String s1 = "Hello World";
		String s2 = "hello World";
		System.out.println(s1.equals(s2));	//true 		-- false
		System.out.println(s1.equalsIgnoreCase(s2)); 	//here its ignoring case sensitivity so it'll give you true
		
		//trim:
		String t = "    Hello Java     ";
		System.out.println(t.trim());	//from both the corners it will trim the spaces.
		
		//replace 
		System.out.println(t.trim().replace(" ", "")); 		// in between spaces will be removed.
		String DOB = "01-01-2000";
		System.out.println(DOB.replace("-", "/")); // to change the format from "-" to this "/".
		
		//UCASE AND LCASE:
		String UC = "this is my code";
		System.out.println(UC.toUpperCase());
		System.out.println(UC.toLowerCase());
		
		//sub string:
		String e1 = "Passcode is 1234";
		System.out.println(e1.substring(7));
		System.out.println(e1.substring(0, 6));
		System.out.println(e1.substring(e1.indexOf("is")+3, e1.length())); 	//without hard coding the value.
		
		//split:	very important from Selenium point of view
		String data = "Tom;25;1000;USA";
		String dataval []= data.split(";");
		System.out.println(dataval[0]);
//		for(String h : dataval) {
//			System.out.println(h);
//		}
		for(int i=0; i<dataval.length; i++) {
			System.out.println(dataval[i]);
		}
		
		String test = "xXjavaXxXpythonxXruby";
		String val []= test.split("xX");
		System.out.println(val[2]);
		
		String name = "Tom Peter Steve";
		//name.split(" ");
		for(int i = 0; i<name.split(" ").length; i++) {
			System.out.println(name.split(" ")[i]);
		}
		
		
		//real life scenario:
		String credentials = "admin;test123";
		String username = credentials.split(";")[0];
		String password = credentials.split(";")[1];
		doLogin(username, password);
	}
	
	
	public static void doLogin(String un, String pwd) {
		System.out.println("login to system with "+un + " "+pwd);
	}
	

}
