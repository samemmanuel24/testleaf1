package pages;

import base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage clickCreateLead() {
		// Click on Create Lead button
					driver.findElementByLinkText("Create Lead").click();

		return new CreateLeadPage ();
	}
		public FindLeadPage clickFindLeads() {
			
		//Click Find Leads
			driver.findElementByLinkText("Find Leads").click();

			return new FindLeadPage ();
	}
		
		public MergeLeadPage clickMergeLead() {
			//Merge Leads
			driver.findElementByLinkText("Merge Leads").click();
			return new MergeLeadPage ();
		}

		
}
