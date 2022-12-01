package ALL_selenuium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A1_NAvigate {


	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.navigate().to("http://www.google.co.in");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	

}}
