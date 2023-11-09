package week3.polymorphismassignment;

public class APIclient {

	
	public void sendRequest(String endPoint) {
		
	}
	
	
public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
		
	}

public static void main(String[] args) {
	
	APIclient API=new APIclient();
	
	API.sendRequest("success");
	API.sendRequest("success","200ok",true);
}

}
