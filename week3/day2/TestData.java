package week3.day2;

public class TestData extends LoginTestData {
	public void EnterCredentials() {
		System.out.println("EnterCredentials method from TestData");

	}
	public void navigateToHomePage() {
		System.out.println("navigateToHomePage method from TestData");

	}
	public static void main(String[] args) {
		TestData TD = new TestData();
		TD.EnterCredentials();
		TD.navigateToHomePage();
		TD.enterPassword();
		TD.enterUsername();
	}

}
