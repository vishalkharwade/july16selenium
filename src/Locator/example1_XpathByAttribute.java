package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
	//	driver.findElement(By.xpath("String xpath expression"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).
		sendKeys("vishalkharwade07@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='pass']")).
		sendKeys("Khvishal012#");
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(200);
	}

}
