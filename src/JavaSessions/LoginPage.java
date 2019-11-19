package JavaSessions;

public class LoginPage {

	public static void main(String[] args) {

		
		LoginPage lp = new LoginPage();
		
	}

	
	//examples of method overloading:
	//method overloading means within the same class we have same method but with different parameters and with different 
	//types of parameters. (for the re-usability purpose)
	// method with 0 parameter
	public void login() {

	}
	//with 1 parameter
	public void login(String userName) {

	}
	
	//this is not method overloading this is method duplicate
//	public void login(String id) {
//
//	}
	public void login(int OTP) {

	}
	
	//with 2 parameter
	public void login(String userName, String password) {

	}
	
	public void login(String facebookID, int phoneNumber) {

	}
	
	//we can change the sequence also.
	public void login(int phoneNumber, String facebookID) {

	}
}
