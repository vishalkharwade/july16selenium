import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		
	
			
			System.setProperty("webdriver.chrome.driver",
					"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
			
		
		
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(200);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
			WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
			
			Actions act=new Actions(driver);
			act.moveToElement(login).perform();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Orders']")).click();
			//driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
			
	}

}
