package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click Show button
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt')]/following::span")).click();
		//switch the driver focus to the alert
		Alert promptAlert = driver.switchTo().alert();
		//read the text of the alert
		String alertMsg = promptAlert.getText();
		System.out.println("Alert Message  : "+alertMsg);
		//pass input to the alert box
		promptAlert.sendKeys("Subraja");
		//Cancel the alert
		promptAlert.accept();
		//verify
		String text = driver.findElement(By.id("confirm_result")).getText();
		if (text.contains("entered")) {
			System.out.println("Input is passed into the alert box");
		}
        
	}

}
