package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_ContextClick {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//Click on close button
		
		WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(loginbtn).perform();
		
		//act.contextClick(loginbtn).perform();
		act.moveToElement(loginbtn).build().perform();
		
		
		
	}

}
