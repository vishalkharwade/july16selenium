package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_Xpath_ByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("vishak");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("vivvv");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("vic");
		
	}
	

}