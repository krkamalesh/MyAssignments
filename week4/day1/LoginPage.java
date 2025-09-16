package week4.day1;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		System.out.println("performCommonTasks method from LoginPage class");
		super.performCommonTasks();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage LP = new LoginPage();
		LP.findElement();
		LP.clickElement();
		LP.enterText();
		LP.performCommonTasks();

	}

}
