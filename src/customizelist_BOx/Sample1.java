package customizelist_BOx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//Step1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//Step2
		Actions act=new Actions(driver);
		//Step3
		act.click(month).perform();
		Thread.sleep(2000);
		//4A Navigate 1 option to bottom
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		//4B navigate1 option to top
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		
		//4C select option using Enter keys
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
