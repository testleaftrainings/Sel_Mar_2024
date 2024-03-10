package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {
	
	
	public static void main(String[] args) {
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//locate the username field and type the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title 
		System.out.println(driver.getTitle());
		//click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on leads link
		driver.findElement(By.linkText("Leads")).click();
		//click on createlead link
		driver.findElement(By.linkText("Create Lead")).click();
		//enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//locate the source dropdown and select directmail option by using index 
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(3);
		
		//select marketcampaign by using text
		WebElement mCDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(mCDD);
		sec1.selectByVisibleText("eCommerce Site Internal Campaign");
		
		//select by value for industry dd
		WebElement inDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sec2 = new Select(inDD);
		sec2.selectByValue("IND_MEDIA");
		
		//click submitbutton
		driver.findElement(By.name("submitButton")).click();
		//print the title
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.close();
		
		
		
	}

}
