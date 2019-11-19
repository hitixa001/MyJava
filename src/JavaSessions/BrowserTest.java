package JavaSessions;

public class BrowserTest {

	public static void main(String[] args) {
		
		SeleniumWebdriver driver = new SeleniumWebdriver();
		driver.launchBrowser("Chrome", "MAC");
	}

}
