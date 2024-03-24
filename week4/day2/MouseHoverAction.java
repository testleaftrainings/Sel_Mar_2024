package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Locate the element
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		//instantiate Actions
		Actions builder =new Actions(driver);
		builder.moveToElement(men).perform();

	}

}
