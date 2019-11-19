package JavaSessions;

public class SeleniumWebdriver {

	public void launchBrowser(String browser,String OS) {
		interactWithBrowser(browser, OS);
		
		
	}
	private void interactWithBrowser(String browser,String OS) {
		if(browser.equals("Chrome")) {
			interactWithChomeServices(OS);
			System.out.println("launch Chrome");
		}else if(browser.equals("FF")) {
			System.out.println("launch FF");
		}
	}
	
	private void interactWithChomeServices(String OS) {
		if(OS.equals("Windows")) {
			System.out.println("Windows-- Chrome");
		}else if(OS.equals("MAC")) {
			System.out.println("MAC-- Chrome");
		}else if(OS.equals("Linux")) {
			System.out.println("Linux-- Chrome");
		}
	}
	
	private void interactWithFireFoxServices(String OS) {
		if(OS.equals("Windows")) {
			System.out.println("Windows-- FF");
		}else if(OS.equals("MAC")) {
			System.out.println("MAC-- FF");
		}else if(OS.equals("Linux")) {
			System.out.println("Linux-- FF");
		}
	}
	
	
}
