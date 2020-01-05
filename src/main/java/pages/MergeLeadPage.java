package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;

import base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods {
	
	
	
			public MergeLeadPage clickImageFromLead() {
				//Click Image of From Lead
				driver.findElementByXPath("(//img[contains(@src,'/images/fieldlookup.gif')])[1]").click();
				return this;
			}
			
			public FindLeadPage switchToNewWindow() {
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> listHandle=new ArrayList<>(windowHandles);
				String str=listHandle.get(1);
				driver.switchTo().window(str);

				return new FindLeadPage();
			}
			public MergeLeadPage clickImageToLead() {
				//Click Image of To Lead
				driver.findElementByXPath("(//img[contains(@src,'/images/fieldlookup.gif')])[2]").click();
				return this;
			}
			public MergeLeadPage switchToParentWindow() throws InterruptedException {
				//Switch the control to parent window
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> listHandle=new ArrayList<>(windowHandles);
				 String str=listHandle.get(0);
				 driver.switchTo().window(str);

						Thread.sleep(2000);

				return this;
			}
			
			public MergeLeadPage clickMerge() throws InterruptedException {
				//Click on Merge button
				driver.findElementByXPath("//a[contains(@class,'buttonDangerous')]").click();
				Thread.sleep(2000);
				return this;
			}
			
			
			
			public ViewLeadPage acceptAlert() throws InterruptedException {
				Alert a =driver.switchTo().alert();
				a.accept();
				return new ViewLeadPage();
			}

			
			

}
