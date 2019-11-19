package JavaSessions;

public class DataConvert {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+20); 	//10020 --string concatination
		//Integer -- its a class
		int i = Integer.parseInt(s);	//100 -- convert the string in to pure integer number
		System.out.println(i+20);	//120
		String y = "12.33";
		System.out.println(y+20);	//12.3320
		double d = Double.parseDouble(y);
		System.out.println(d+20); 	//32.33
		
		String a = "100A";
		System.out.println(a+100);
		int b = Integer.parseInt(a.replace("A", ""));	//java.lang.NumberFormatException
		System.out.println(b+100);	
		
		int j = 100;
		System.out.println(j);
		String k = String.valueOf(j);
		System.out.println(k+300);
		
		
	}

}
