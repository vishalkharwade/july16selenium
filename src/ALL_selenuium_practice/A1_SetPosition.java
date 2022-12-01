package ALL_selenuium_practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_SetPosition {
	
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		Point p=new Point(100,30);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.close();
		

	}}
