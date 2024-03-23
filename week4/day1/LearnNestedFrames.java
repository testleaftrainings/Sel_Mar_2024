package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {
	
	/*
	 * Frame 1 
	 *  button
	 *  Frame 2
	 *    button
	 *   Frame 3
	 *     button
	 *    Frame 4
	 *      button    
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//switch the focus to the parent frame by using index
		driver.switchTo().frame(2);
		//switch to the child frame by passing the attribute value of (name/id)
		driver.switchTo().frame("frame2");
		//click the button 
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.switchTo().parentFrame();
        
	}

}
