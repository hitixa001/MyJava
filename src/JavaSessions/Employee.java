package JavaSessions;

public class Employee {
	//data members: class members:
	//what you mean by class: class is always a template of an object(class is an entity with that you can create multiple objects with diff values)i.e human is class	
	//1.class vars: declare at the class level (means immediately after the class you have to declare it)
	//2.class methods:
	
	String name;
	int age;
	char gender;
	boolean isPermanent;

	public static void main(String[] args) {
		
		//here object reference name is 'e1' and 'new Employee();' is the object.
		Employee e1 = new Employee();	//syntax for creating the object
		e1.name = "A";
		e1.age =28;
		e1.gender ='M';
		e1.isPermanent=true;
		//System.out.println(e1.name +" "+e1.age+" "+e1.gender+" "+e1.isPermanent);
		
		Employee e2 = new Employee();
		e2.name ="B";
		e2.age=25;
		e2.gender='F';
		e2.isPermanent=false;
		
		Employee e3 = new Employee();
		e3.name ="c";
		e3.age=30;
		
		e3.gender='F';
		e3.isPermanent=true;
		
		System.out.println(e1.name +" "+e1.age+" "+e1.gender+" "+e1.isPermanent);
		System.out.println(e2.name +" "+e2.age+" "+e2.gender+" "+e2.isPermanent);
		//e3 = null;
		System.out.println(e3.name +" "+e3.age+" "+e3.gender+" "+e3.isPermanent);
		
		e1 = e2;
		e2 = e3;
		e3 = e1;
		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e3.name);
		
		//without any reference also we can access all the properties but this is not at all good practice.
		//garbage collector will destroy this object immediately memory is full or by the user because there is no reference.
//		new Employee().name="D";
//		new Employee().age=30;
//		new Employee().gender='M';
//		new Employee().isPermanent=false;
		//System.gc(); //to call the garbage collector manually but thers's no guarantee that gc will delete it until it gets command from jvm.
						//and if jvm feels then only it gives command to gc that yes please go and make some free memory.
						//so the best practice is not to create object without references.
		
		

	}

}
