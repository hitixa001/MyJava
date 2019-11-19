package InheritanceConcept;

//if you declared a class with final keyword then you can not have any child classed -- final keyword used here to prevent inheritance
public class Car extends Vehicle{
	
	//static method can not be overridden but it can be overloaded.
	/*
	 * public static void start() { System.out.println("car --- start"); }
	 */
	//final method cannot be overridden.
	/*
	 * public final void start() { System.out.println("car --- start"); }
	 */

	public void start() {
		System.out.println("car --- start");
	}

	public void stop() {
		System.out.println("car --- stop");
	}

	public void refule() {
		System.out.println("car --- refule");
	}

}
