package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example11_parallel2 {
	@Test
	public void OpenGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
	}
}
