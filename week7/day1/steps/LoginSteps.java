package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	

	@Given("Enter the username as {string}")
	public void enter_the_username(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}

	@When("Click on the Login Button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void home_page_should_be_displayed() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("HomePage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
	}


	@But("ErrorMessage should be displayed")
	public void error_message_should_be_displayed() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains("Errors")) {
			System.out.println("Error message is displayed");
		}
		else {
			System.out.println("Error message is not displayed");
		}
	}


	


}
