package POM_TSNG_SCRREENALL;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.jce.provider.BrokenJCEBlockCipher.BrokePBEWithSHA1AndDES;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxLoginTestNG extends Baseclass {
	Upstoxlogin1page log1;
	Upstoxlogin2page log2;
	Upstoxwelcomepage wel;
	UpstoxHomepage home;
	wishlist A1;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		initializBrowser();
	
		log1=new Upstoxlogin1page(driver);
		log2=new Upstoxlogin2page(driver);
		wel=new Upstoxwelcomepage(driver);
		home=new UpstoxHomepage(driver);
		A1=new wishlist(driver);
	
	}
	@BeforeMethod
	public void logintoApp() throws EncryptedDocumentException, IOException {
		log1.inpUpstoxlogin1pageUserName(Utilityclass.getpropertFileData("UN"));
		log1.inpUpstoxlogin1pagePassWord(Utilityclass.getpropertFileData("PWD"));
		log1.ClickUpstoxlogin1pageLoginBtn();
		log2.InpUpstoxlogin2pageBirth(Utilityclass.getpropertFileData("YOB"));
		wel.clickUpstoxWelcomePageWelcome();
	
	}
	@Test(enabled = false)
	public void VarifyID() throws EncryptedDocumentException, IOException, InterruptedException {
		TCID=100;
		String expPN = home.VarifyUpstoxHomepageUser();
		String ActPN=Utilityclass.getId(0, 3);
		Assert.assertEquals(expPN, ActPN,"Fail:Both result not match");
	Thread.sleep(2000);
	}
	
	@Test
	public void varifywatchlist() throws InterruptedException, IOException {
	A1.wishlistdrops1c();
	A1.wishlistsel2c();
	A1.wishlistselec3c();
	A1.wishlistaddc4c();
	A1.wishlistsend5s(Utilityclass.getpropertFileData("wish"));
	A1.wishlistclick6c();
	}
	@AfterMethod
	public void logoutApp(ITestResult s1) throws IOException {
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			Utilityclass.FailtestScreenshot(driver, TCID);
		}
		
	}
	@AfterClass
	public void closeBrowser() {
		//driver.close();
	}
	

}
