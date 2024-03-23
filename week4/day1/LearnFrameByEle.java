package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameByEle {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//switch the focus to the frame by using WebElement
		driver.switchTo().frame(eleFrame);
	    driver.findElement(By.xpath("//ol[@id='selectable']/li")).click();
		
        
	}

}
