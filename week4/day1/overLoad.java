package week4.day1;

public class overLoad {
	
	public void reportStep(String msg, String Status) {
		System.out.println("two args" +" Super Class");	
System.out.println(msg +" "+ Status);
	}
public void reportStep(String msg, String Status, boolean snap) {
		
	System.out.println("three args");
	System.out.println(msg +" " +Status +" "+ snap);
	}

	public static void main(String[] args) {
		overLoad oL = new overLoad();
		oL.reportStep("message", "pass");
		oL.reportStep("message 1", "fail", true);
	}

}
