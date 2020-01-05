package pages;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage enterCompanyName(String data) {
		// Enter Company Name
					driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;
	}
	public CreateLeadPage enterfirstName(String data) {
		// Enter first Name
					driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}
	public CreateLeadPage enterLastName(String data) {
		// Enter first Name
					driver.findElementById("createLeadForm_lastName").sendKeys(data);
		return this;
	}
	
	public ViewLeadPage clickCreateLeads() {
		// Click on Create Lead (Submit) button
					driver.findElementByName("submitButton").click();

		return new ViewLeadPage ();
	}

}
