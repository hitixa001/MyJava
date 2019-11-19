package AbstractCencept;

public class TestPage {

	public static void main(String[] args) {
		
		Page.signUp();
		LoginPage lp = new LoginPage();
		lp.header();
		lp.title();
	HomePage hp = lp.login("test", "test123");
		hp.header();
		hp.title();
		hp.userDetails();
		hp.logOut();
		
	//	Page p = new Page();	--for the abstract class and interface can not create the object
		
		//Top-Casting
		Page p = new LoginPage();
		
		
		//Down-Casting -- its not possible.
		//new Page();
		
		}

}
