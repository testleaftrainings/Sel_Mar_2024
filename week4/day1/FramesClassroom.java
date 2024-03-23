package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesClassroom {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//switch the focus to the frame by using name
		driver.switchTo().frame("iframeResult");
		// click on try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to  the alert
		Alert alert = driver.switchTo().alert();
		//read the alert text
		System.out.println(alert.getText());
		//accept the alert
		alert.accept();
		//verify
		String text = driver.findElement(By.id("demo")).getText();
		if (text.contains("OK")) {
			System.out.println("Alert accepted");
		}
		
	


	}

}
