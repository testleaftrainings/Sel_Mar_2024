package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//getWindowHandle -> returns the current windowhandle
		String pWindowHandle = driver.getWindowHandle();
		System.out.println(pWindowHandle);
		
		//get the title of the parent window
		String pTitle = driver.getTitle();
		System.out.println("Parent title is : "+pTitle);
		
		//click on the open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowHandles -> return Set<String>
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The total no: of windows : "+windowHandles.size());
		
		//convert Set into list to use get() to switch between indices
		List<String> handlesList=new ArrayList<>(windowHandles);
		
		//switch to the child window
		driver.switchTo().window(handlesList.get(1));
		
		//get the title of the child window
		String cTitle = driver.getTitle();
		
		//verify
		if (!pTitle.equals(cTitle)) {
			System.out.println("Successfully switched to new Window");
		}else {
			System.out.println("Control stays in the same Window");
		}
		
		driver.switchTo().window(pWindowHandle);
		System.out.println(driver.getTitle());
		
		driver.quit();
	


	}

}
