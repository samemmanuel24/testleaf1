package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.Learnexcel;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public String datasheetName;
		@BeforeMethod
		//@Parameters({"url","username","password"})
		public void login() {
			// Set the property for ChromeDriver
					System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					// Initiate the ChromeBroswer
					driver = new ChromeDriver();
					driver.get("http://leaftaps.com/opentaps/control/main");
					// Maximize the browser
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
		}
		@AfterMethod
		public void logout() throws InterruptedException {
			
			driver.close();
		}
		@DataProvider
		public String[][] getData() throws IOException{
			Learnexcel data = new Learnexcel();
//			String [] [] data =new String[2] [3] ;
//			data[0][0]="Google";
//			data[0][1]="Sam";
//			data[0][2]="Selvaraj";
//			data[1][0]="Amazon";
//			data[1][1]="Sam";
//			data[1][2]="Emmanuel";
		return new Learnexcel().readexcel(datasheetName);	
	//return data.L.readexcel(excelfileName);
		}


}
