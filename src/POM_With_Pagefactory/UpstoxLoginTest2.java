package POM_With_Pagefactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxLoginTest2 {
	UpstoxLogin1page login1;
	UpstoxLogin2page login2;
	UpstoxWelcomepage welcome;
	UpstoxHomepage home;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\16julyA.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe");
		 driver=new  ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 login1=new UpstoxLogin1page(driver);
		 login2=new UpstoxLogin2page(driver);
		 welcome=new UpstoxWelcomepage(driver);
		 home=new UpstoxHomepage(driver);
		
	}
	@BeforeMethod
	public void logintoApp() 
	{
		login1.enterUN(sh.getRow(0).getCell(0).getStringCellValue());
		login1.enterPWD(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickonLoginbtn();
		login2.enterYOB(sh.getRow(0).getCell(2).getStringCellValue());
		welcome.clickUpstoxWelcomepageONAmGood();
	}
	@Test
	public void VarifyUserID1() {
		//home.varifyUSerID(sh.getRow(0).getCell(3).getStringCellValue());
		String actPN = home.getUpstoxHomePageActPN();
		String extPN = sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(actPN, extPN,"fail: both result not match");
	}
@AfterMethod
public void logoutFromApp() {
	
}
@AfterClass
public void CloseBrowser() {
	
	driver.quit();
}
}
