package pages;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {
	
	public DuplicateLeadPage enterfirstName(String data) {
		// Enter first Name
		driver.findElementById("createLeadForm_firstName").clear();
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}
	public ViewLeadPage clickCreateLeads() {
		// Click on Create Lead (Submit) button
					driver.findElementByName("submitButton").click();

		return new ViewLeadPage ();
	}


}
