package AbstractCencept;

public abstract class Page {

	//we can not create the object but we can create the constructor of abstract class. 
	//and it will be called when child class(base class) object will be created.
	//if you have created constructor in child classes too then first preference will be given to parent class always and then child class constructors
	public Page() {
		System.out.println("Page class constructor");
	}
	//abstract method is just like prototype method its does not have method body.
	//in interface you dont need to write abstract key word its by default abstract method.
	//Abstract class can have abstract and non - abstract methods both.
	public abstract void header();
	public abstract void title();
	public  final void logOut() {
		System.out.println("user logged out");
		
	}
	public static void signUp() {
		System.out.println("Page --- signUp");
	}
}
