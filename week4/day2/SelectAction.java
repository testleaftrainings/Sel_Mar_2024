package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectAction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//frame
		driver.switchTo().frame(0);
		//Locate the element
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		//
		Actions builder =new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item2).click(item4).click(item6)
		.keyUp(Keys.CONTROL).perform();
		builder.clickAndHold(item2).moveToElement(item6).release().perform();
		

	}

}
