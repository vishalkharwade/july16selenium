package customizelist_BOx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice4 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//Step1
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	//Step2
	Actions act=new Actions(driver);
	
	//Step3
	act.click(month).perform();
	Thread.sleep(2000);
	
	act.sendKeys(Keys.END).perform();
	Thread.sleep(3000);
	
	//for navigate july otion using arrow up key
	
	for(int i=0;i<=5;i++) {
		act.sendKeys(Keys.ARROW_UP).perform();
	}Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	
	
}

}
