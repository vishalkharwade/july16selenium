package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_clear {
	public static void main(String[] args) throws InterruptedException   {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver v1=new ChromeDriver();
	v1.get("https://www.facebook.com");
	
WebElement Un=v1.findElement(By.xpath("//input[@id='email']"));
Un.sendKeys("bbbb");
Thread.sleep(2000);
Un.clear();
Thread.sleep(2000);
Un.sendKeys("hhhhh");
	
	
	
	
	
	}
	

}
