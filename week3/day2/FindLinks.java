package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
	/**
	 * findElements() -> finds all matching element in the current webpage
	 * returns -> list of WebLements
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// to find multiple elements
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		// to find the total number of links in this page
		System.out.println("The total no: of links in this page : " +allLinks.size());
		
		// to get the 3rd WebElement from the list
		WebElement ele = allLinks.get(3);
		System.out.println(ele.getText());
		
		//declare a list
		List<String> list = new ArrayList<>();
		
//		// to print all the items
//		for (int i = 0; i < allLinks.size(); i++) {
//			String text = allLinks.get(i).getText();
//			list.add(text);
//		}
		
		for (WebElement each : allLinks) {
			String text = each.getText();
			list.add(text);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
	}

}
