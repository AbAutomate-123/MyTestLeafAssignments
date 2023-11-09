package week3.assignmentday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   //implicitly wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://leafground.com/checkbox.xhtml");
		   

	
		  // Alternative pwd
		   //Username: Demosalesmanager
		   //Password: crmsfa
		   
			Thread.sleep(2000);
		   //click basic checkbox Using Sibling preceding
		   WebElement ClickBasicCheckbox = driver.findElement(By.xpath("//span[contains(text(),'Basic')]/preceding-sibling::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		   ClickBasicCheckbox.click();
		
			
			WebElement ClickNotificationCheckbox = driver.findElement(By.xpath("//span[contains(text(),'Ajax')]/preceding-sibling::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
			ClickNotificationCheckbox.click();
				Thread.sleep(2000);
		
			//used ancestor to locate
				//label[contains(text(),'Java')]/ancestor::div[@class='grid formgrid']//div[@class='ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']
			
				WebElement ChooseFavlangCheckbox = driver.findElement(By.xpath("//table[@role='presentation']/following::label[contains(text(),'Javascript')]"));
				ChooseFavlangCheckbox.click();
					Thread.sleep(10000);
		   
					//doubt in tribox 
				
//					WebElement TriCheckbox = driver.findElement(By.xpath("//div[@class='grid formgrid']//div[@class='ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/span[@class='ui-chkbox-icon ui-c']/parent::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
//					TriCheckbox.click();
//						Thread.sleep(2000);
						
						//Toggle switch
						
						//div[@class='card']//div[@class='ui-toggleswitch-slider']
						
						WebElement Toggleswitch = driver.findElement(By.xpath("//div[@class='card']//div[@class='ui-toggleswitch-slider']"));
						Toggleswitch.click();
							Thread.sleep(2000);
							
							
						
							WebElement VerifyDisabled = driver.findElement(By.xpath("//div[@class='card']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']/following-sibling::span[contains(text(),'Disabled')]"));
							String text = VerifyDisabled.getText();
							System.out.println(text);
								Thread.sleep(2000);
								String text1="Disabled";
								if(text1.contains(text)) {
									System.out.println("Disabled");
								}else
								{
									System.out.println("Not Disabled");
								}
								
								WebElement clickDropdown=driver.findElement(By.xpath("//div[@role='combobox']"));
								clickDropdown.click();
								Thread.sleep(2000);
								
								//doubt in checkbox
								WebElement Multiplselect = driver.findElement(By.xpath("//div[@class='card']//div[@class='ui-helper-hidden']/label[contains(text(),'Miami')]"));
								Multiplselect.click();
								Thread.sleep(2000);
								
								
	}	
	

}
