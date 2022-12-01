package ActionClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_OfHAndlingDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
		//Step:1
	WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//Step:2
		Actions act=new Actions(driver);
		
		//step:3
		act.moveToElement(loginbtn ).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
