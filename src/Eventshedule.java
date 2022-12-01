import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Eventshedule {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
			driver.get("https://calendar.google.com/calendar");
			
			WebElement ss = driver.findElement(By.xpath("//div[@class='XOrBDc']"));
		Actions aa=new Actions(driver);
	aa.click(ss).sendKeys(Keys.ARROW_UP).click().perform();
	Thread.sleep(100);
	//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vishal");
	}
		
		
	}
	
	


