package JavaSessions;

public class Travel {

	public static void main(String[] args) {
		
		
		Travel e = new Travel();
		e = null;
		
//		Employee e = new Employee();
//		e = null;
		
		//request JVM to call garbage collector (GC)
		System.gc();
		System.out.println("process done");

	}
	
	@Override
	public void finalize() {
		System.out.println("this is my finalize method");	//if you create the object of some other class(Employee) then this method will not be called.
		//but if you create the of same class(Travel) then this method will be called.
		}

}
