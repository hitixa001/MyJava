package JavaSessions;

public class IncrementalAndDecrement {

	public static void main(String[] args) {

		// ++ --
		//-- and ++ are only once if you want to increase or decrease by more then 1 then directly use the number 2/3/etc...
		int i = 1; // post means later
		int j = i++; // post increment: first it will give the original value of 'i' to 'j' and then
						// it will increase the value of 'i' by one.
		System.out.println(i); // 2
		System.out.println(j); // 1

		int a = 2;
		int b = a--;
		System.out.println(a); // 1
		System.out.println(b); // 2

		int k = 1; // pre means before
		int l = ++k; // pre increment: first it will increase original value of 'k' by one and then
						// it will be given to 'l'
		System.out.println(k); // 2
		System.out.println(l); // 2

		int c = 2;
		int d = --c;
		System.out.println(c); // 1
		System.out.println(d); // 1
		
		int s = 0;
		int t = --s;
		System.out.println(s);	//-1
		System.out.println(t);	//-1
	}

}
