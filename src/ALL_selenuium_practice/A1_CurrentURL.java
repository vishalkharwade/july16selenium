package ALL_selenuium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_CurrentURL {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.irctc.co.in/");
		
		String GetURL = driver.getCurrentUrl();
		System.out.println(GetURL);
		driver.close();

}
}