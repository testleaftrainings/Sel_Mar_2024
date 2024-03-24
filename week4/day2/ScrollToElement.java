package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Locate the element
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Connect with Us']"));
		//instantiate Actions
		Actions builder =new Actions(driver);
		builder.scrollToElement(scroll).perform();

	}

}
