package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass{
	
	@When("Click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.partialLinkText("CRM")).click();
	}

	@When("Click on the leads link")
	public void click_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on the createLead link")
	public void click_on_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the companyname as (.*)$")
	public void enter_the_companyname(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("Enter the firstname as (.*)$")
	public void enter_the_firstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Given("Enter the lastname as (.*)$")
	public void enter_the_lastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Leadid should be displayed as (.*)$")
	public void leadid_should_be_displayed(String cName) {
		String text = driver.findElement(By.xpath("//span[text()='Company Name']/following::span")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead is verified");
		}
		else {
			System.out.println("Not verified");
		}

	}



}
