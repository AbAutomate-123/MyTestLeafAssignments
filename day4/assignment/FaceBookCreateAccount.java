package week2.day4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver driver = new ChromeDriver();
		
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Load the url
		driver.get("https://en-gb.facebook.com/");
		
	
		
		//Click on create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		//wait
		Thread.sleep(1000);
		
		//Enter the First Name
		driver.findElement(By.name("firstname")).sendKeys("Arvind");
		
		//wait
		Thread.sleep(1000);
		
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("R");
		
		//wait
		Thread.sleep(1000);
		
		//Enter the mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("8754567599");
		
		//wait
		Thread.sleep(1000);
		
		//Enter the new password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		
		//wait
		Thread.sleep(1000);
		
		//Handle all three dropdowns in Date of birth
		
		WebElement birthdaydateDD = driver.findElement(By.name("birthday_day"));
		Select date = new Select(birthdaydateDD);
		date.selectByIndex(14);
		
		//wait
		Thread.sleep(1000);
				
		WebElement birthdayMonthDD = driver.findElement(By.name("birthday_month"));
		Select month = new Select(birthdayMonthDD);
		month.selectByValue("11");
		
		//wait
		Thread.sleep(1000);
		
		WebElement birthyearDD = driver.findElement(By.name("birthday_year"));
		Select year = new Select(birthyearDD);
		year.selectByVisibleText("1989");
		
		//wait
		Thread.sleep(1000);
		
		//Radio Button Selection for gender
		By radioSelector = By.cssSelector("input[value='2']"); 
        WebElement radioButton = driver.findElement(radioSelector);
        radioButton.click();
		
    	//wait
		Thread.sleep(1000);
		
		//Sign up button
		By submitSelector = By.name("websubmit");
		WebElement submitButton = driver.findElement(submitSelector);
		submitButton.click(); 
        
		
	}

}
