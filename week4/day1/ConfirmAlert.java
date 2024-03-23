package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click Show button
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm')]/following::span")).click();
		//switch the driver focus to the alert
		Alert confirmAlert = driver.switchTo().alert();
		//read the text of the alert
		String alertMsg = confirmAlert.getText();
		System.out.println("Alert Message  : "+alertMsg);
		//Cancel the alert
		confirmAlert.dismiss();
		//verify
		String text = driver.findElement(By.id("result")).getText();
		if (text.contains("Cancel")) {
			System.out.println("Alert is Cancelled");
		}
        
	}

}
