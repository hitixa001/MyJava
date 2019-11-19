package InheritanceConcept;

public class BMW extends Car {
	
	@Override	//when ever you see this @Override it means we overriding this from parent class
				//its not compulsory to write @Override but its good practice to write it.
	public void start() {
		System.out.println("BMW --- start");
	}

	public void autoAirSuspension() {
		System.out.println("BMW --- Suspensionp");
	}

	
}
