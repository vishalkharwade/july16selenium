
package mock_practice_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Index {
public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver v1=new ChromeDriver();
	v1.get("file:///E:/new%20html%20code/vishaltag.html");
	Thread.sleep(2000);
	
	v1.findElement(By.tagName("input")).sendKeys("vishal");
	Thread.sleep(2000);
	v1.findElement(By.tagName("input")).sendKeys("vishal");
	
}
}
