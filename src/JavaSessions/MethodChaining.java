package JavaSessions;

public class MethodChaining {

	public static void main(String[] args) {
		m1();
		MethodChaining ns = new MethodChaining();
		ns.ns1();
		//this.	  we cannot access this. here. this.keyword is related to object and object cannot hold any allocation for static.
	}

	// example of method chaining
	public static void m1() {
		m2();
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		System.out.println("Bye");
	}

	public void ns1() {
		ns2();
	}

	public void ns2() {
		this.ns3();
		ns3();
	}

	public void ns3() {
		ns4();
	}

	public void ns4() {
		System.out.println("Hey");
	}

}
