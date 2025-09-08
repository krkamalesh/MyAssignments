package week3.bday2.B3;

public class JavaConnection extends MySqlConnection{

	
	public static void main(String[] args) {
		JavaConnection jC = new JavaConnection();
		jC.connect();
		jC.disconnect();
		jC.executeUpdate();
		jC.executeQuery();
		
		

	}

	public void connect() {
		System.out.println("connect method");
		
	}

	public void disconnect() {
		System.out.println("disconnect method");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate method");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("executeQuery method");
		
		
	}

}
