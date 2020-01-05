package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_CreateLead extends ProjectSpecificMethods {
	@BeforeClass
	public void setData() {
		datasheetName="TC001_CreateLead";
	}
  @Test(dataProvider="getData")
	public void tC001_CreateLead(String UName,String Password,String CName,String fName,String LName,String FName1){
		new LoginPage()
		.enterUserName(UName)
		.enterPassword(Password)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(CName)
		.enterfirstName(fName)
		.enterLastName(LName)
		.clickCreateLeads()
		.verifyCreatedLead(FName1);			
	}
}
