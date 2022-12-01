package frameworkPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxLOGnPracticeTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Upstoxlogin1practicepage log1=new Upstoxlogin1practicepage(driver);
		log1.Enterusername1();
		log1.Enterpassword1();
		log1.ClickOnloginBTN1();
		
		Upstoxlogin2Practice_page log2=new Upstoxlogin2Practice_page(driver);
		log2.EnterBIRThDATE();
		
		
		UpstoxWelcomePracticepage log3=new UpstoxWelcomePracticepage(driver);
		log3.clickonwelcomepage1();
		
		UpstoxHomePracticepage log4=new UpstoxHomePracticepage(driver);
		log4.varifyid();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
