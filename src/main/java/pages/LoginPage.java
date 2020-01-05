package pages;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUserName(String data) {
		// Enter the UserName
		driver.findElementById("username").sendKeys(data);
		return this;
	}
	public LoginPage enterPassword(String data) {
		// Enter the Password
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin() {
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}
