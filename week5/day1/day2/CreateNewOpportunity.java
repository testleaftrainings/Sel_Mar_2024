package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewOpportunity extends BaseClass{

	@Test
	public  void runCreateOpp() {
		
		
        //Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        //Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
        //Click on Opportunity tab 
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		//Click on Accounts tab
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", accounts);
		//Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//Enter 'your name' as account name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("SalesForce Automation by Subraja");
		//choose close date
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//td[@class='slds-is-today']")).click();
		//click stage
		driver.findElement(By.xpath("//label[text()='Stage']/following::button[1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();//span[@title='Needs Analysis']
        //click save
		WebElement element = driver.findElement(By.xpath("//button[text()='Save']"));
		driver.executeScript("arguments[0].click();", element);
		//verify message
		String verifymsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a"))
				.getAttribute("title");
		if (verifymsg.contains("SalesForce Automation")) {
			System.out.println("Toast message verified");
		}
		else {
			System.out.println("Toast message is not verified");
		}
		
       
		
		
	}

}
