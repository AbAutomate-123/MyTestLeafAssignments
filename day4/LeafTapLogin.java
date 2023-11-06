package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		ChromeDriver driver= new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
//max window
		driver.manage().window().maximize();
		//locate the username
		
		driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
		
		Thread.sleep(2000);
		//locate the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		Thread.sleep(2000);
		
		//click submit
		
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		
		
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
	//type company name
	
	WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
	Companyname.sendKeys("TestLeaf");
	Thread.sleep(2000);
	
	WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
	FirstName.sendKeys("Ab");
	Thread.sleep(2000);
	
	WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
	lastName.sendKeys("R");

	
	Thread.sleep(2000);
	
	
	//Select dropdown
	
	WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataDourceId"));
	
	Select source = new Select(sourceDD);
	
	source.selectByIndex(3);
	Thread.sleep(2000);
	
	source.selectByVisibleText("Partner");
	
	Thread.sleep(2000);
	
	source.selectByValue("LEAD_WEBSITE");
	Thread.sleep(2000);
	
	
	
WebElement marketCampdDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	
	Select markCamp = new Select(marketCampdDD);
	
	markCamp.selectByVisibleText("Car and Driver");
	Thread.sleep(2000);
	
	
	
	
	
	//click create lead btn
	
	WebElement CreateLeadbtn = driver.findElement(By.className("smallSubmit"));
	
	CreateLeadbtn.click();
	
	Thread.sleep(2000);
	
	//get the title of the page 
	Thread.sleep(2000);
	String Vleadpage = driver.findElement(By.tagName("title")).getText();
	
		System.out.println(Vleadpage);
		Thread.sleep(2000);
	if (Vleadpage.contains("view")){
		
		System.out.println("View Lead page is successful");
	}else 
	{
		System.out.println("page not loaded");
	}
		
	}

}
