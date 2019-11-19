package AbstractCencept;

public class HomePage extends Page{

	public HomePage() {
		System.out.println("HomePage constructor");
	}

	@Override
	public void header() {
		
		System.out.println("HomePage --- header");
	}

	@Override
	public void title() {
		System.out.println("HomePage --- title");
		
	}

	public void userDetails() {
		System.out.println("HomePage --- userDetails");
		
	}
	
	
	
}
