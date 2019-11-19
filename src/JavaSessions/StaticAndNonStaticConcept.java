package JavaSessions;

public class StaticAndNonStaticConcept {
	
	String name;
	static int age;

	//object cannot be hold any static variable and static method.
	//static method and static variable always will be stored some where in side the stack memory.
	//stack memory also known as common memory allocation
	
	//main method is static in nature because its called by java(jvm).
	//main method is void because we don't return anything within main method. we don't write 'return' keyword within main method.
	public static void main(String[] args) {
		
		//how to call static variables & static methods.
		//Two ways to call them : 1. use them directly 
		age = 25;
		System.out.println(age);
		getName();
		//name = "abc"; 	here name is not static so it will give you error.
		//search(); 	same here search method is not static so you can not access it directly.
		//2. use by className.
		StaticAndNonStaticConcept.age = 30;
		System.out.println(age);
		StaticAndNonStaticConcept.getName();
		
		//how to call non-static variables and methods.
		//by creating the object
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.name = "ABC";
		
		//we can access static methods and variables by using object but it will give you warning.(The static method getName() 
		//from the type StaticAndNonStaticConcept should be accessed in a static way) so this is not the right way.
		//obj.getName();
		//obj.age = 21;
		
		
		
		
		

	}
	
	public void search() {
		System.out.println("Search Method");
	}
	
	public static void getName() {
		System.out.println("Get Name Method");
	}

}
