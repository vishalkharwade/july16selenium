package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 {
 
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.quit();	
}
}
