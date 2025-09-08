package week3.bday2.B3;

public interface DatabaseConnection {
	abstract void connect();
	void disconnect();
	public void executeUpdate();

}
