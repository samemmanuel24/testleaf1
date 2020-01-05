package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_EditLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setData() {
		datasheetName="TC002_EditLead";
	}
  @Test(dataProvider="getData")
	public void tC002_EditLead(String UName,String Password,String FName,String CName,String CName1) throws InterruptedException{
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
		.clickEdit()
		.enterCompanyName(CName)
		.clickUpdate()
		.verifyEditLead(CName1);
	}
}
