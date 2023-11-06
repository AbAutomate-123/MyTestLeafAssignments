package week2.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();
		//load the url
		driver.get("https://www.facebook.com/");
		
//max window
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//locate the username
		
		driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		
WebElement findAcc = driver.findElement(By.linkText("Find your account and log in."));
		
findAcc.click();

Thread.sleep(6000);

String Forgotten = driver.getTitle();
System.out.println(Forgotten);

System.out.println(Forgotten);

if (Forgotten.contains("Forgotten")){

System.out.println("Forgotten page is successful");
}else 
{
System.out.println("page not loaded");
}

Thread.sleep(6000);
driver.close();

}
		
		
		
	}


