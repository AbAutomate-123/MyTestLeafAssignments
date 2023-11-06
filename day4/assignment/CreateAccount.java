package week2.day4.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		   driver.get("http://leaftaps.com/opentaps/.");
		   
		   String accountname="TestLeaf OnShore Account";
		   //maximize window
		   driver.manage().window().maximize();
		   
		   //implicitly wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   //login
		   driver.findElement(By.id("username")).sendKeys("DemoCSR");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   
		   //click the CRMSFA
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   Thread.sleep(2000);
		   //create lead
		   driver.findElement(By.linkText("Accounts")).click();
		   driver.findElement(By.linkText("Create Account")).click();
		   Thread.sleep(2000);
		   //company name
		   driver.findElement(By.id("accountName")).sendKeys(accountname);
		   Thread.sleep(2000);
		   
		   //first name
		   driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		   Thread.sleep(2000);
		   //Last name
		   
		   //select computer software
		   WebElement findElement1 = driver.findElement(By.name("industryEnumId"));
		   Select industry = new Select(findElement1);
		   industry.selectByIndex(2);
		   Thread.sleep(2000);
		   //select s-corporation
		   WebElement findElement2 = driver.findElement(By.name("ownershipEnumId"));
		   Select ownership = new Select(findElement2);
		   ownership.selectByVisibleText("S-Corporation");
		   Thread.sleep(2000);
		   //select source
		   WebElement findElement3 = driver.findElement(By.id("dataSourceId"));
		   Select source = new Select(findElement3);
		   source.selectByValue("LEAD_EMPLOYEE");
		   Thread.sleep(2000);
		   //select e-commerce 
		   WebElement findElement4 = driver.findElement(By.name("marketingCampaignId"));
		   Select select2 = new Select(findElement4);
		   select2.selectByIndex(5);
		   Thread.sleep(2000);
		   //select Texas
		   WebElement findElement5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		   Select state = new Select(findElement5);
		   state.selectByValue("TX");
		   Thread.sleep(2000);
		   //click create lead
		   driver.findElement(By.className("smallSubmit")).click();
		   Thread.sleep(6000);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   //get title
		   String title = driver.getTitle();
		   System.out.println(title);
		   
		  
			// using xpath with Index
			   String accountname1 =driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		   
		   
		   //Verify the account name 
		   if(accountname1.contains(accountname)) {
			   System.out.println("The Account creation is checked");
		   } else {
				   System.out.println("The no creation page displayed");
			   }
		   
		   
		   //verify title
		   if(title.contains("Account")) {
			   System.out.println("The Account is created");
		   } else {
				   System.out.println("The Account is not created");
			   }
		   
		  //close the browser 
		   driver.close();
		
		
	}

}
