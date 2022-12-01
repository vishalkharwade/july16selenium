import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class aa { 
	
	@Parameters("openBrowser")
	@Test
	public void openBrowser(String Browser) throws InterruptedException {
		
		WebDriver driver=null;
	if (Browser.equals("chrome")){
	System.setProperty("webdriver.chrome.driver",
			"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
	 driver=new ChromeDriver();
	}
	else if(Browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\\\selenium\\\\geckodriver-v0.32.0-win64\\\\geckodriver.exe" );
		 driver=new FirefoxDriver();
	}
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	
}
}


