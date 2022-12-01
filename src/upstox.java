import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://api.upstox.com/index/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("FC7144");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vishal07@");
		driver.findElement(By.xpath("//button[@id='submit-btn']")).click();
		driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1993");
	driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='watchlistSelect_dropdown']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//div[@id='new-watchlist_suffix']")).click();
	 //driver.findElement(By.xpath("//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[@type='text']")).sendKeys("mock");
	//driver.findElement(By.xpath("//div[@class='_2Zj7zuh0aYIa3JQ9dKvLkB']//button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@id='Mock_title']")).click();
	driver.findElement(By.xpath("//div[text()='Add a scrip']")).click();
	driver.findElement(By.xpath("//div[@class='_2qSoU5m9p_WTwxgb5exwsU _2MBORvY3t6NJsLnmzvwK2m']/input[1]")).sendKeys("ITC");
	driver.findElement(By.xpath("//div[@class='_3m7-JJ1fOc5hbNSPofJatj']/button[@id='NSE_EQ|1660']")).click();
	}
	
	
}//
