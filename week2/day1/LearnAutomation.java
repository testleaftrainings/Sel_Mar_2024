package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearnAutomation {
	
	/**
	 * Locators :
	 * id,name,classname,linktext,partiallinktext,tagname,xpath,css
	 * Basic Locators:
	 * id,name,classname,linktext,partiallinktext
	 * findElement() -> locate the The first matching element on the current page
	 * The return type of findElement() -> WebElement
	 * sendKeys() -> to simulate typing into an element
	 * click() -> to perform click action
	 * getTitle() -> Get the title of the current page. 
	 */
	public static void main(String[] args) {
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
		driver.findElement(By.name("submitButton")).click();
		//print the title
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
