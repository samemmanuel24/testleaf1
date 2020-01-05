package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC004_DuplicateLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setData() {
		datasheetName="TC004_DuplicateLead";
	}
  @Test(dataProvider="getData")
	public void tC004_DuplicateLead(String UName,String Password,String FName,String FName1,String FName2) throws InterruptedException{
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
		.clickDuplicate()
		.enterfirstName(FName1)
		.clickCreateLeads()
		.verifyDuplicateLead(FName2);
}
}
