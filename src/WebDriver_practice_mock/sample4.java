package WebDriver_practice_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver v1=new ChromeDriver();
		//v1.get("https://login.facebook.com/");
		v1.navigate().to("https://login.facebook.com");
		v1.navigate().to("https://login.upstox.com/");
		v1.manage().window().maximize();
		v1.manage().window().minimize();
		String url=v1.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(200);
		v1.navigate().back();
		Thread.sleep(100);
		v1.navigate().forward();
		Thread.sleep(100);
		v1.navigate().refresh();
}

}

