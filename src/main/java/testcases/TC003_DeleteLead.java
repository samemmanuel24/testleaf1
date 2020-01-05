package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC003_DeleteLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setData() {
		datasheetName="TC003_DeleteLead";
	}
  @Test(dataProvider="getData")
	public void tC003_DeleteLead(String UName,String Password,String FName) throws InterruptedException{
		new LoginPage()
		.enterUserName(UName)
		.enterPassword(Password)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(FName)
		.clickFindLeads()
		.clickFirstResult()
		.clickDelete()
		.clickFindLeads()
		.enterDeletedID()
		.clickFindLeads()
		.verifyDeletedLead();
}
}
