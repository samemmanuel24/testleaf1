package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC005_MergeLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setData() {
		datasheetName="TC005_MergeLead";
	}
  @Test(dataProvider="getData")
	public void tC005_MergeLead(String UName,String Password,String ID1,String ID2,String ID3) throws InterruptedException{
		new LoginPage()
		.enterUserName(UName)
		.enterPassword(Password)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLead()
		.clickImageFromLead()
		.switchToNewWindow()
		.enterID(ID1)
		.clickFindLeads()
		.clickFirstResultMerge()
		.switchToParentWindow()
		.clickImageToLead()
		.switchToNewWindow()
		.enterID(ID2)
		.clickFindLeads()
		.clickFirstResultMerge()
		.switchToParentWindow()
		.clickMerge()
		.acceptAlert()
		.clickFindLeads()
		.enterID(ID3)
		.clickFindLeads()
		.verifyMergeLead();
	}
}
