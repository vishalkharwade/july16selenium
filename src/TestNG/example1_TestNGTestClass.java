package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example1_TestNGTestClass {
	
	
	@Test
	public void openFAcebokApp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.close();
	}

}
