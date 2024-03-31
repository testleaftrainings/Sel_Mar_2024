package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class LearnDropDown {
	
	@Test//(invocationCount = 2,invocationTimeOut  = 60000 )
	public  void runCreateLead() throws IOException {
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the window
		driver.manage().window().maximize();
		//locate the username field and type the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title 
		System.out.println(driver.getTitle());
		
		//to take snapshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/leaftaps.png");
		FileUtils.copyFile(src, dest);

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
		//click submitbutton
		WebElement ele = driver.findElement(By.name("submitButton"));
		ele.click();
		File src1 = ele.getScreenshotAs(OutputType.FILE);
		File dest1= new File("./snaps/submit.png");
		FileUtils.copyFile(src1, dest1);
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		driver.close();
		
		
		
	}

}
