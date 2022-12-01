package guru99_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_TestClass1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Bank Project']")).click();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr453360");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zAbepyq");
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);
		Guru99_project_module1 ss=new Guru99_project_module1(driver);
		ss.NewCustmer();
		
		
	}
	
	
	

}
