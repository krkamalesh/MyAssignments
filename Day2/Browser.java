package week1.day2;

public class Browser {
	
	void loadUrl() {
		System.out.println("Url loaded successfully");
	}
	
	void launchBrowser(String browserName) {
		System.out.println(browserName);
	}
	
	public static void main(String[] args) {
		
		Browser b1 = new Browser();
		b1.launchBrowser("Chrome");
		b1.loadUrl();
		
	}

}
