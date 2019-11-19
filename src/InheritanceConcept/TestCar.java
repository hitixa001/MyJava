package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		
		BMW b = new BMW();
		b.start();	//BMW method will be called here (Overridden method will be called)
		b.refule();	//car method will be called here (this not overridden its coming from parent class)
		b.autoAirSuspension();	//(this is coming from child class)
		b.engine();	//you can access the properties from the grandparent also
		
		// why it is called Polymorphism? -- poly means 'many', morphism means 'forms' -- it means you are creating method with many forms.
		// method overloading and method overriding both are called Polymorphism.
		
		//when we have same class methods with different parameters that is method overloading -- method overloading is always decided
		// at the compile time.(also know as COMILE TIME POLYMORPHISM)
		
		//but when we have different classes(parent&child) with same methods and number of parameters its method overridden -- method overriding
		//is decided at the run time(by JVM).(also know as RUN TIME POLYMORPHISM)
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refule();
		c.engine();
		//here you can not access 'autoAirSuspension' because parent can not inherit/take any property from child.
		
		//new BMW();	--HERE you can create BMW class without any reference name but if a particular object does not have any object reference 
						//name it will be destroyed after some times by GC(GARBAGE COLLECTOR).
		//CHILD CLASS OBJECT CAN BE REFERRED BY PARENT CLASS REFERENCE VARIABLE.
		
		//this CONCEPT(line no. 33)is called 'TOP CASTING'-- meaning we are going to cast the child object with parent class object variable.
		Car c1 = new BMW();
		c1.start(); 	//BMW method will be called (preference always will be given to overridden method)	
		c1.engine();
		
		Vehicle v1 = new Car();
		Vehicle v2 = new BMW();
		
		//concept of reference signature type checking -- that's why from Car c1. we cannot access autoAirSuspension
		
		//DOWN CASTING---parent class object referred by child class object (we never use it)
//		BMW b1 = (BMW) new Car();	//here it will give you error so just before the object convert the Car() in to BMW().
			//but the moment you run it at the run time you get Exception: java.lang.ClassCastException
		//i.e JUST TO UNDERSTAND-- BMW, AUDI, MERC all are car BUT NOT ALL THE CAR are BMW, AUDI OR MERC. and that's why at the runtime you get exception.
		
		
	}

}
