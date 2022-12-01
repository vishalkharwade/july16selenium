package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Example12_MultiBrowserTesting {
@Parameters("browsername")
	@Test
	public void Openbrowser(String browsername) throws InterruptedException {
	WebDriver driver=null;
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
			 driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
