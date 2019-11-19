package Testing;

import Test.Meeting;	

public class GotoMeeting extends Meeting{

	public GotoMeeting(int id, String pwd) {
		super(id, pwd);	//super keyword is always use to call super class constructor
		
	}

	public static void main(String[] args) {
		Meeting m = new Meeting(555, "test555");
		m.start();
		System.out.println(m.id);
//System.out.println(go.isRecorded);	here its not possible to call protected because its with the outside the package in subclass
		//not by subclass.

		GotoMeeting go = new GotoMeeting(101, "test101");
		System.out.println(go.isRecorded); 	//here we need to create the object of subclass and by that subclass we can call the protected modifier.
		
		
		
	}

}
