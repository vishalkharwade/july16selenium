package POM_TSNG_SCRREENALL;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
 WebDriver driver;
	public void initializBrowser() throws IOException {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\DELL\\eclipse-workspace\\16jul6 selenium\\BrowserFile\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(Utilityclass.getpropertFileData("URL"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}}
	
