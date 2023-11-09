package week3.abstractassignment;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaConnection java =new JavaConnection();
		java.executeQuery();
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		
		System.out.println("Abtract unimplemented body called in JavaConnection using extend");
	}

}
