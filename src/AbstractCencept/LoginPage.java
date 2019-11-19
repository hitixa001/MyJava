package AbstractCencept;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("LoginPage constructor");
	}
	@Override
	public void header() {
		System.out.println("LoginPage --- header");
		
	}

	@Override
	public void title() {
		System.out.println("LoginPage --- title");
		
	}
	
	public HomePage login(String un, String pwd ) {
		System.out.println("LoginPage --- login");
		System.out.println("Login with "+un+" and "+pwd);
		return new HomePage();
	}
	
//	@Override 		//non abstract methods is also override but its a violation so to restrict write the final keyword in Page class
//	public  void logOut() {
//		System.out.println("LoginPage --- logOut");
//	}
	
	

}
