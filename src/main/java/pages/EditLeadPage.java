package pages;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage enterCompanyName(String data) {
		// Enter Company Name
		driver.findElementById("updateLeadForm_companyName").clear();					
		driver.findElementById("updateLeadForm_companyName").sendKeys(data);
		return this;
	}
	
	public ViewLeadPage clickUpdate(){
		//Click Update
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}

}
