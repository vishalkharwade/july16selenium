package ALL_selenuium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class listbox1 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(3000);
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 
		 act.sendKeys(Keys.ARROW_UP).perform();
		 act.sendKeys(Keys.ARROW_UP).perform();
		 act.sendKeys(Keys.ARROW_UP).perform();
		 act.sendKeys(Keys.ARROW_UP).perform();
		 act.sendKeys(Keys.ARROW_UP).perform();
			
		 act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();	}

}
