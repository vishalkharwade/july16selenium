import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynaamic {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14 pro max");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		String rev = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[9]")).getText();
		System.out.println(rev);
		
	}
	

}
