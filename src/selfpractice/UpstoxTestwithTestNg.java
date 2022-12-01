package selfpractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxTestwithTestNg extends BaseClass{
	Upstoxlogin1page log1;
	Upstoxlogin2page log2;
	UpstoxwelcomePage3 wel;
	UpstoxHomepage home;
	int TCID;
	
	@BeforeClass

	public void openBrowser() {
		initializeBrowser();
		 log1=new Upstoxlogin1page(driver);
		 log2=new Upstoxlogin2page(driver);
		 wel =new UpstoxwelcomePage3(driver);
		 home=new UpstoxHomepage(driver);
		 
	}
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException {
		log1.inpUpstoxHomepageUserName(UtilityClass.getId(0, 0));
		log1.inpUpstoxHomepagePassword(UtilityClass.getId(0,1));
		log1.clickpUpstoxHomepagesinglogin();
		log2.inpUpstoxlogin2pageBIRTH(UtilityClass.getId(0, 2));
		wel.clickUpstoxWelcomePageWelcome();
	}
	@Test
	public void varifyUserID() throws EncryptedDocumentException, IOException {
		String actPN = home.VarifyUpstoxHomepageUSerId();
		String expPN=UtilityClass.getId(0, 3);
		Assert.assertEquals(actPN, expPN,"Faile:both Result Not Match");
		TCID=101;
	}
@AfterMethod
	public void LogoutFromApp(ITestResult s1) throws IOException {
	if(s1.getStatus()==ITestResult.FAILURE) {
		UtilityClass.capturescreenshot(driver, TCID);
		
	}
		
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
	driver.quit();
	}
}
