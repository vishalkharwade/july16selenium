package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendkeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

	boolean result = driver.findElement(By.xpath("//input[@id='pass']")).isEnabled();
System.out.println(result);
WebElement Un=	driver.findElement(By.xpath("//input[@id='email']"));
Un.sendKeys("vishal");

	}
	

}
