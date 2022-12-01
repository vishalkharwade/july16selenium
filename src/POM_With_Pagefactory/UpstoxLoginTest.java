package POM_With_Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxLoginTest {
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		UpstoxLogin1page login1=new UpstoxLogin1page(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickonLoginbtn();
		
		UpstoxLogin2page login2=new UpstoxLogin2page(driver);
		login2.enterYOB();
		
		UpstoxWelcomepage welcome=new UpstoxWelcomepage(driver);
		welcome.clickUpstoxWelcomepageONAmGood();
		
		UpstoxHomepage home=new UpstoxHomepage(driver);
		home.varifyUSerID();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
		
		
	}


