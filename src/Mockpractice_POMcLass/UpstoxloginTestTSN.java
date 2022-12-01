package Mockpractice_POMcLass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxloginTestTSN extends BaseClass{
	 UpstoxLogin1page log1;
	 UpstoxLogin2page log2;
	 UpstoxWelcomePage log3;
	  UpstoxHomepage log4;
	
	@BeforeClass
	public void openBrowser() {
		InnitializeBrowser();
		  log1 = new UpstoxLogin1page(driver);
		  log2=new UpstoxLogin2page(driver);
		  log3=new UpstoxWelcomePage(driver);
		  log4=new UpstoxHomepage(driver);
	}
	@BeforeMethod
	public void LogintoApp() throws EncryptedDocumentException, IOException {
	log1.InpUpstoxLogin1pageUserName(UtilityClass.getId(0, 0));
	log1.inpUpstoxLogin1pagePassword(UtilityClass.getId(0, 1));
	log1.clickUpstoxLogin1pageLoginbutton();
	log2.inpUpstoxLogin2pageBirthDate(UtilityClass.getId(0, 2));
	log3.clickUpstoxWelcomePageWelcome();
	
	}
	@Test
	public void varifyID1() throws EncryptedDocumentException, IOException {
		String actPN = log4.variyUpstoxHomepageUserID();
		String expPN = UtilityClass.getId(0, 3);
		Assert.assertEquals(actPN, expPN,"Fail:Both result not match");
	}
	@AfterMethod
	public void LogoutFromApp() {
		
	}
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	
	
	
	

}
