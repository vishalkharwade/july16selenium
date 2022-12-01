package mock_practice_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver v1=new ChromeDriver();
		v1.get("https://www.facebook.com/");//get URL
		Thread.sleep(2000);
		
		v1.findElement(By.xpath("//input[@id='email']")).sendKeys("vishalkharwade");
		Thread.sleep(2000);
		v1.findElement(By.xpath("//input[@id='pass']")).sendKeys("Kharwadevishal");
		Thread.sleep(2000);
		v1.findElement(By.xpath("//button[@name='login']")).click();		
	}

}
