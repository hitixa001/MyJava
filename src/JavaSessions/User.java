package JavaSessions;

import javax.jws.soap.SOAPBinding.Use;

public class User {
	
	//class variables
	String name;
	int age;
	int userID;
	char gender;
	boolean isActive;
	static int wheels;
	
	//another way is to define with constructor.
	//there are 2 types of constructor : 1) default(no parameter), 2)with parameter.
	//constructor name always will be remain same as class name.
	public User() {
		System.out.println("default/0 parameter constructor");
	}
	//duplicate constructor is not allowed
//	public User() {
//		System.out.println("default/0 parameter constructor");
//	}
	
	//constructor overloading is possible
	public User(String name) {
		System.out.println("1 parameter constructor: "+ name);
	}
	
	public User(String name, int i) {
		System.out.println("2 parameter constructor: "+ name+" "+i );
	}
	//create the constructor with class variables:
	//but these are (String name, int age, int userID, char gender, boolean isActive) local variables its not class variables
	//we will never write return keyword within constructor. constructor will never return anything.
	//constructor is use to define the class variables.
	//constructor CANNOT be static because constructor is always related to object and object can not hold any static values.
	public User(String name, int age, int userID, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.userID = userID;
		this.gender = gender;
		this.isActive = isActive;
	}
	
	//we can create constructor with limited class variables too.
	public User(String name, int age, int userID, int wheels) {
		this.name = name;
		this.age = age;
		this.userID = userID;
		this.wheels = wheels;	//this is static in nature so it'll be showing you warning to access it with static way 
	}

	

	public static void main(String[] args) {
		
		//this is one of the way to use the class variables
//		User u1 = new User();
//		u1.name = "tom";
//		
//		User u2 = new User();
//		u2.name = "sam";
		
		User us = new User();	//default constructor will be called automatically.
		User us1 = new User("Tom");
		User us3 = new User("Tom", 100);
		
		User us4 = new User("Sam", 25, 101, 'M', true);
		System.out.println(us4.userID+" "+us4.name+" "+us4.gender);	//the default value of int and string will be printed 0 null, but the moment
		//we initialise class variables with 'this' keyword you'll get all the values
		//we can change the local variable name as well(i.e name1) but unnecessary we have to create different parameter just to avoid confusion.
		User us5 = new User("Ben", 28, 102, 'M', true);
		User us6 = new User("Tom", 30, 103, 'M', false);
		User us7 = new User("Dann", 21, 104, 'M', true);
		System.out.println(us5.name +" "+us5.isActive);
		
		User us8 = new User("Mini", 21, 105, 4);
		System.out.println(us8.name+" "+us8.wheels);
		
		
		
	}
	
	
}
