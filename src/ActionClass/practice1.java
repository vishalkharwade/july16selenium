package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class practice1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\selenium\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
		 WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		//Step1
	 WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
		//step2
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(loginbtn).perform();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
