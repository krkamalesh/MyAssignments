package week4.day1;

public class overRide extends overLoad {
	
	public void reportStep(String msg, String Status) {
		System.out.println("two args Own Class");	
System.out.println(msg +" "+ Status);
super.reportStep(msg, Status);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overRide oR = new overRide();
		oR.reportStep("msg1", "Complete");
		

	}

}
