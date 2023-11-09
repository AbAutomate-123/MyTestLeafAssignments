package week3.assignmentday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   //implicitly wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://leafground.com/radio.xhtml");
		   //maximize window
	
		  // Alternative pwd
		   //Username: Demosalesmanager
		   //Password: crmsfa
		   
		   driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
			driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
			boolean selected = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).isSelected();
			System.out.println(selected);
			 if(selected==false) {
				 System.out.println("Hence verified");
			 }
			 else {
				 System.out.println("operation failed");
			 }
			boolean selected2 = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
			System.out.println(selected2);
			 if(selected2==false) {
				 System.out.println("Hence verified");
			 }
			 else {
				 System.out.println("operation failed");
			
			 }
			 boolean selected3 = driver.findElement(By.xpath("(//label[text()='21-40 Years'])")).isSelected();
			 System.out.println(selected3);
			 if(selected3==false) {
				 System.out.println("Hence verified");
			 }
			 else {
				 System.out.println("operation failed");
			 }
		   

	}

}
