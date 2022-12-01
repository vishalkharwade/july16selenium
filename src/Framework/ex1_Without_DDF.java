package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_Without_DDF {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
	boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		
		if(result==true) {
			System.out.println("logo found-->TC pass");
		}else {
			System.out.println("logo not found--->TC fail");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	
}
