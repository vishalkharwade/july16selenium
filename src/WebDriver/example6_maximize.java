package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_maximize {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();//use for short
		
		//option s1=driver.manage();
		//window s2=s1.window();
		//s2.maximize();
		
	}
	

}
