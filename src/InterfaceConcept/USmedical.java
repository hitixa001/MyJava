package InterfaceConcept;

//multiple inheritance is achievable by using interface.
//we never write the main method in interface / instead of class we have to write interface here.(because this an interface not a class)
//intention of interfaces is to define the rules.
public interface USmedical extends WHO {
	
	//there is no method body in interface. -- only method declaration. -- 100% abstraction
	//interface is only for defining the method prototype thats why no method body.
	//because we can not override static methods and in interface overridden is compulsory we its not possible to have static methods in interface.
	//we can not create object of interface -- strictly not allowed.
	
	//we can create variable in interface.
	//Variables are by default static & final in nature. so no need to write static/final
	int min_fee=10;
	
	public void embulanceServices();
	
	public void orthoservices();
	
	public void pediatricianServices();
	
	//private void test();	// private methods can not be override or inherit thats why its not allowed in interface.
	
	//after jdk1.8 2 new features got added.
	//1.can have method body -- with default method. --it can be overridden -- but it does not affect the intention behind the interface.
	//but practically we don't use it.
	default void radiologyServices() {
		System.out.println("US --- radiologyServices ");
	}
	
	//2.can have static methods in interface-- for prototype method --it can not be overridden
	public static void billing() {
		System.out.println("US --- billing");
	}
	
	
	

}
