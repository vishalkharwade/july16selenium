package mockpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
			"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
	 
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/");
	Actions act=new Actions(driver);
	act.moveToElement(null)
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("")).sendKeys("");
	driver.findElement(By.xpath("")).sendKeys(args);
	driver.findElement(By.xpath("")).click();
}
}