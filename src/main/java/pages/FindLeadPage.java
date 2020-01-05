package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {
	public static String leadid;
	public FindLeadPage clickPhone() {
		//Click Phone
		driver.findElementByXPath("(//span[text()='Phone'])").click();
		return this;
	}
	
	public FindLeadPage enterFirstName(String data) {
		//enter First name
	driver.findElementByXPath("(//label[contains(text(),'First')])[3]/following::input[1]").sendKeys(data);
			return this;
	}
	
	public FindLeadPage clickFindLeads() throws InterruptedException {
		//Click findleads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}
	//
	public ViewLeadPage clickFirstResult() throws InterruptedException {
		//Click first result
		leadid=driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new ViewLeadPage();
	}
	public FindLeadPage enterDeletedID() {
		driver.findElementByName("id").sendKeys(leadid);
			return this;
	}
	public FindLeadPage verifyDeletedLead() {
		//Verify Deleted ID
		String text =driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if(text.equals("No records to display"))
		{
			System.out.println("No records to display is displayed for LEAD ID "+leadid);
		}
		else
		{
			System.out.println("No records is deleted for LEAD ID "+leadid);
		}
		
		
		return this;
	}
	public FindLeadPage enterID(String data) {
		//enter ID
				driver.findElementByName("id").sendKeys(data);
		return this;
	}
		public MergeLeadPage clickFirstResultMerge() throws InterruptedException {
		//Click first result
		leadid=driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new MergeLeadPage();
	}
		
		public FindLeadPage verifyMergeLead() {
			//Verify Merge Lead
			WebElement recordInfo=driver.findElementByXPath("//div[@class='x-paging-info']");
			String result=recordInfo.getText();

			if(result.equals("No records to display"))
			{
				System.out.println("Records deleted");
			
			}
			else
			{
				System.out.println("No records deleted");
			}
			
			return this;
		}
	
	
	
	

}
