package guru99_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingFirst {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
	 
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Bank Project']")).click();
 
	// WebElement aa = driver.findElement(By.xpath("//span[text()='Close']"));
	// driver.switchTo().frame("iframe");
	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr453360");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zAbepyq");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	//new customer detail
	//driver.findElement(By.xpath("//div[@id='cbb']")).click();
	
	driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	//click on advertise
	//driver.findElement(By.xpath("//div[@id='cbb']")).click();
	
	//Add New Custmer detail
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("vishal kharwade");
	driver.findElement(By.xpath("(//input[@name='rad1'])[1]")).click();
	driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("07/09/2022");
	
	
}
}
