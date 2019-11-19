package JavaSessions;

public class Login {
	
	String name;
	String password;
	int OTP;
	long mobileNum;
	String facebookID;
	
	public Login(String name, String password, int OTP, long mobileNum, String facebookID) {
		this.name = name;
		this.password = password;
		this.OTP = OTP;
		this.mobileNum = mobileNum;
		this.facebookID = facebookID;
	}

	public Login(String facebookID, int OTP) {
		this.facebookID = facebookID;
		this.OTP = OTP;
	}


	public Login(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
//	public Login() {
//		
//	}
	
	public void doLogin() {
		System.out.println("login with: "+ facebookID +" "+OTP);
	}

	public static void main(String[] args) {
		
		//Login l1 = new Login();	//this will give you error because there is no default constructor, so we have to create default constructor to overcome this error.
		Login l1 = new Login("test", "test123");	//name & password
		System.out.println(l1.name +" "+ l1.password);
		Login l2 = new Login("hitixa@gmail.com", 1234);	//facebookID
		l2.doLogin();
		
		
		

	}

}
