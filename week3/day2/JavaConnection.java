package week3.day2;

public class JavaConnection implements DatabseConnection{

	public static void main(String[] args) {
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();

	}

	public void connect() {
		System.out.println("connect method");
		
	}

	public void disconnect() {
		System.out.println("disconnect method");
		
	}

	public void executeUpdate() {
		System.out.println("executeupdate method");
		
	}

}
