package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {
	
	/**
	 * TargetLocator -> Interface
	 * RemoteTargetLocator is the implementation class of TargetLocator
	 * Alert -> Interface
	 *    accept(),dismiss(),getText(),sendKeys()
	 *
	 * RemoteAlert is the implementation class of Alert
	 * NoAlertPresentException
	 * UnhandledAlertException
	 */

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on the show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch the driver focus to the alert
		Alert simpleAlert = driver.switchTo().alert();
		//read the alert text
		String alertText = simpleAlert.getText();
		System.out.println("Alert Message : "+alertText);
		//accept the alert
		simpleAlert.accept();
		//verify
		String text = driver.findElement(By.id("simple_result")).getText();
		if (text.contains("success")) {
			System.out.println("ALert is handled");
		}
        
	}

}
