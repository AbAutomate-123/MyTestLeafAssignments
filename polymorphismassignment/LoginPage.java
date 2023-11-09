package week3.polymorphismassignment;

public class LoginPage extends BasePage {
	
	
	public void findElement() {
		
		System.out.println("LoginPage findElement");
		
	}
	
	public void clickElement() {
		
		System.out.println("LoginPage clickElement");
	}
	
	public void enterText() {
		
		System.out.println("LoginPage enterText");
	}
	
	public void performCommonTasks() {
		
		System.out.println("BasePage performcommontasks");
	}
	
	
	public static void main(String[] args) {
		
		LoginPage LoginPage=new LoginPage();
		
		LoginPage.clickElement();
		
		LoginPage.findElement();
		
		LoginPage.enterText();
		
		LoginPage.performCommonTasks();
	}

}
