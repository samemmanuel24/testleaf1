package pages;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage verifyLogin() {
		//Verify Login
		String text = driver.findElementByTagName("h2").getText();
		if (text.contains("Demo"))
		{
			System.out.println("Test cases Passed");
		}
		else
		{
			System.out.println("Test cases Failed");
		}
		
		return this;
	}
	public LoginPage clickLogout() {
		//Click Logout
		driver.findElementByClassName("decorativeSubmit").click();
		
		return new LoginPage();
	}
	public MyHomePage clickCrmsfa() {
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		
		return new MyHomePage();
	}
	

	
}
