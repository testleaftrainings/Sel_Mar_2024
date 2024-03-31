package week5.day2;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority = 1)
	public void createLead() {
		System.out.println("Lead created");

	}
	
	@Test(priority = 2)
	public void editLead() {
		System.out.println("Lead Editted");

	}
	
	@Test(priority = 1)
	public void deleteLead() {
		System.out.println("Lead Deleted");

	}
	
	@Test(priority = -2)
	public void duplicateLead() {
		System.out.println("Duplicate Lead created");

	}
	
	@Test(priority = -1)
	public void mergeLead() {
		System.out.println("Leads merged");

	}

}
