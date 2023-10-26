// Creating methods and calling using a object



package week1.day1.assignment;

public class MobileAssignment2 {
	
	
	public void makeCall() {
	
		String mobileModel="Samsung";
		float mobileWeight=110.5f;
		System.out.println("This is my Mobile:"+" "+ mobileModel+" "+",This is my MobileWeight:"+" "+mobileWeight);
	}
	
	public void sendMsg() {
		
		boolean isFullCharged=true;
		int mobileCost=69999;
		System.out.print(",Is it charged:"+" "+ isFullCharged+""+",My mobile costs a fortune"+" "+ mobileCost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileAssignment2 M=new MobileAssignment2();
		M.makeCall();
		M.sendMsg();
		
	}

}
