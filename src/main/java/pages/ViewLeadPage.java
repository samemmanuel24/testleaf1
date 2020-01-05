package pages;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage verifyCreatedLead(String data) {
		//Verify created Lead
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if (text.contains(data))
		{
			System.out.println("Test cases Passed as lead created with first name  "+data);
		}
		else
		{
			System.out.println("Test cases Failed");
		}
		
		return this;
	}
	public MyLeadPage clickDelete() throws InterruptedException {
		// Click on Delete
		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
		return new MyLeadPage ();
	}
	
	public EditLeadPage clickEdit() throws InterruptedException {
		// Click on Edit button
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		Thread.sleep(2000);
		return new EditLeadPage ();
	}
	public ViewLeadPage verifyEditLead(String data) {
		//Verify created Lead
		
		String cnamae=driver.findElementById("viewLead_companyName_sp").getText();
		if(cnamae.contains(data))
		{
			System.out.println("Expected CompanyName is Changed to "+data);
		}
		else {
		}
		return this;
	}
	public DuplicateLeadPage clickDuplicate() throws InterruptedException {
		//Click Duplicate lead
				driver.findElementByLinkText("Duplicate Lead").click();
				Thread.sleep(2000);
		return new DuplicateLeadPage ();
	}
	public ViewLeadPage verifyDuplicateLead(String data) {
		//Verify created Lead
		String str=driver.findElementById("viewLead_firstName_sp").getText();
		if(str.equals("Sam"))
		{
			System.out.println("Same name remains");
		
		}
		else
		{
			System.out.println("Name updated");
		}

		
		return this;
	}
	public FindLeadPage clickFindLeads() {
		
		//Click Find Leads
			driver.findElementByLinkText("Find Leads").click();

			return new FindLeadPage ();
	}

	

}
