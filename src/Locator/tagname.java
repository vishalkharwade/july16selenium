package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///E:/new%20html%20code/new.html\\");
	
	driver.findElement(By.tagName("input")).sendKeys("vishal");
	driver.findElement(By.tagName("input")).sendKeys("vihsjskakakakaka");
}
	
	
	
	
}
