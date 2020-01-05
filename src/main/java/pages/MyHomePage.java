package pages;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeadPage clickLeads() {
		// Click on Leads
					driver.findElementByLinkText("Leads").click();
		
		return new MyLeadPage();
	}

}
