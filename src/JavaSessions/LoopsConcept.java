package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// while, for, do-while
		// infinite loop, storage of memory loop: these are call pitfalls in java.

		// 1.while:
		int i = 1; // Initialisation part
		while (i <= 10) { // conditional part
			System.out.println(i++); // this will print 1-10... if we don't write incremental/decremental (i++) it
										// will generate infinite loop.
		}

		// 2.for: when ever there is a order-base collection we have to use for loop.
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

//		for(;;) { the syntax here is correct but it will generate infinite loop
//			System.out.println("Test");
//		}
//		
		// 3. do-while:
		int b = 1;
		do {
			System.out.println(b++);
		} 
		while (b <= 10);

	}

}
