package week3.assignmentday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadUsingXpath {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   //implicitly wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("http://leaftaps.com/opentaps/.");
		   
		   String accountname="TestLeaf OnShore Account";
		   //maximize window
	
		  // Alternative pwd
		   //Username: Demosalesmanager
		   //Password: crmsfa
		   
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
			
			//click Create Lead
			Thread.sleep(2000);
		WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
			
		CreateLead.click();
		
		Thread.sleep(2000);
		
		
		WebElement Companyname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		Companyname.sendKeys("TestLeaf");
		Thread.sleep(2000);
		
		WebElement ForeName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		ForeName.sendKeys("Ab");
		Thread.sleep(2000);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
		FirstName.sendKeys("Arvind");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("R");
		Thread.sleep(2000);
		
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		Email.sendKeys("arvind11@gmail.con");
		Thread.sleep(2000);
		
		
		
		WebElement Phone = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']"));
		Phone.sendKeys("8754567");
		Thread.sleep(2000);
		
		WebElement marketCampdDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select markCamp = new Select(marketCampdDD);
		
		markCamp.selectByVisibleText("Car and Driver");
		Thread.sleep(2000);
		
		WebElement CreateLeadbtn = driver.findElement(By.className("smallSubmit"));
		
		CreateLeadbtn.click();
		
		Thread.sleep(9000);
		
		
		
		WebElement ClickEditBtn = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		
		ClickEditBtn.click();
		
		Thread.sleep(6000);
		
		WebElement Description = driver.findElement(By.xpath("//textarea[@name='description']"));
		
		Description.sendKeys("Edited");
		
		Thread.sleep(6000);
		
		//Updated
      WebElement Updatebtn = driver.findElement(By.xpath("//input[@value='Update']"));
		
      Updatebtn.click();
		
		Thread.sleep(6000);
		
		
		
		//paget title 
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		//verify the title 
		
		if(title1.contains("View")) {
			System.out.println("Updated successfull");
		}else {
			System.out.println("Update not successfull");
		}
		
		
		driver.close();
		

	}

}
