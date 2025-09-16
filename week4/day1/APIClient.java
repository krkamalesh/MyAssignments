package week4.day1;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		// TODO Auto-generated method stub
		System.out.println("method with one I/P argument "+"\n"+ "Message Data " +"\n"+ endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		// TODO Auto-generated method stub
		System.out.println("method with multiple I/P argument "+ "Message Data " +"\n"+ endPoint +"\n"+ requestBody +"\n"+ requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient AC = new APIClient();
		AC.sendRequest("Its a endPoint");
		AC.sendRequest("Its a endPoint2", "Its a requestBody", true);

	}

}
