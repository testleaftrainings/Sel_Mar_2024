package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		// to find multiple elements
		List<WebElement> allMobilePrice = driver.findElements(By.className("a-price-whole"));
		
		for (WebElement each : allMobilePrice) {
			String text = each.getText();
			System.out.println(text);
			
		}
		 //print unique mobile prices
		
		
		
		
		
		
		
		
	}

}
