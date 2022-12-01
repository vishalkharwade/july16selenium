package mockpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HAndling_dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement drop = driver.findElement(By.xpath("//select[@id='drop1']"));
drop.click();
		 Actions act=new Actions(driver);
	 act.moveToElement(drop).perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).build().perform();	
	
	WebElement radio = driver.findElement(By.xpath("//input[@id='radio1']"));
radio.click();
if(radio.isSelected()) {
	System.out.println("pass");
}
else {
	System.out.println("fai;");
}
	}
	
	
	
	
	
	
	}
