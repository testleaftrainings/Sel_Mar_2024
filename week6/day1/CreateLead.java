package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CreateLead extends BaseClass{

	@BeforeTest
	public void setValues() {
		fileName="CreateLeadExcelSheet";

	}

	@Test(dataProvider = "fetchData")
	public void runCreateLeadTestcase(String cName,String fName,String lName,String phNo) {
//		Faker fake = new Faker();
//		String firstName = fake.name().firstName();
//		String lastName = fake.name().lastName();
//		String companyName = fake.company().name();
		driver.findElement(By.linkText("Lead")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}

}
