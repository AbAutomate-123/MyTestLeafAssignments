package week3.assignmentday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLeadUsingXpath {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   //implicitly wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("http://leaftaps.com/opentaps/.");
		   
		   String accountname="TestLeaf OnShore Account";
		   //maximize window
	
		   
		
		   
		   //login
		   driver.findElement(By.id("username")).sendKeys("DemoCSR");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   
			//paget title 
			String title = driver.getTitle();
			System.out.println(title);
			
			//verify the title 
			
			if(title.contains("TestLeaf")) {
				System.out.println("Leaftap login successfull");
			}else {
				System.out.println("Login failed");
			}
			
			
			Thread.sleep(2000);
			
			//ClickCRM/SFA
			
			WebElement CRM = driver.findElement(By.linkText("CRM/SFA"));
			
			CRM.click();
			
			//click Leads tab
			Thread.sleep(2000);
			WebElement Leads = driver.findElement(By.linkText("Leads"));
			
			Leads.click();
			
			//click Find Lead
			Thread.sleep(2000);
		WebElement FindLead = driver.findElement(By.linkText("Find Leads"));
			
		FindLead.click();
		
		Thread.sleep(2000);
		
		
		WebElement PhoneTab = driver.findElement(By.xpath("//span[text()='Phone']"));
		PhoneTab.click();
		Thread.sleep(2000);
		
		WebElement PhoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		PhoneNumber.sendKeys("90");
		Thread.sleep(2000);
		
		WebElement FindLeads = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		FindLeads.click();
		Thread.sleep(2000);
		
		WebElement FirstLeadClick = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]"));
		Thread.sleep(2000);
		FirstLeadClick.click();
		
		
		
		
	WebElement ClickDeleteBtn = driver.findElement(By.xpath("//a[contains(text(),'Delete')]"));
		
	ClickDeleteBtn.click();
		
		Thread.sleep(6000);
		
		
		
		//Repeat step
		
		//click Find Lead
		Thread.sleep(2000);
	WebElement FindLead1 = driver.findElement(By.linkText("Find Leads"));
		
	FindLead1.click();
	
	Thread.sleep(2000);
	
	
	WebElement PhoneTab1 = driver.findElement(By.xpath("//span[text()='Phone']"));
	PhoneTab1.click();
	Thread.sleep(2000);
	
	WebElement PhoneNumber1 = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
	PhoneNumber1.sendKeys("8754567");
	Thread.sleep(2000);
	
	WebElement FindLeads1 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
	FindLeads1.click();
	Thread.sleep(2000);
	
	String title3 = "No Records";

	
	//verify no Records
	
	if(title3.contains("No")) {
		System.out.println("Deletion Successfull");
	}else {
		System.out.println("Deletion not successfull");
	}

	}

}
