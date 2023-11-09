package week3.abstractassignment;

public class ConcreteClass implements DataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void connect() {
	System.out.println("Connect");
		
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("ExecuteUpdate");
		
	}

}
