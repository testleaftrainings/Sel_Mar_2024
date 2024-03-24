package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Locate the table
		WebElement table = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));
		// Locate the row
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		// Locate the column
		List<WebElement> columnCount = table.findElements(By.tagName("th"));
		//print size or row
		System.out.println("Row count:"+rowCount.size());
		//Print column count
		System.out.println("Column Count:"+columnCount.size());
		//Print particular data
		String data = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr[2]/td[2]")).getText();
        System.out.println("UK Total:"+data);
        for (int i = 1; i <rowCount.size() ; i++) {
			//for(int j = 1; j <columnCount.size() ; j++) {
        String country = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table//tr["+i+"]")).getText();
        
        System.out.println(country);
			
        
        
	}
	
	}
}
