package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_getTitle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	System.out.println(title);
	
	}
	
	
	
	

}
