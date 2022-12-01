import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Itrera {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
	 
	WebDriver driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vishal");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9673862891");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishalkharwade@gmail.com");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Khvishaloq12");
	Thread.sleep(500);
	driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("At.parbhani");
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(1000);
	//driver.close();
	driver.findElement(By.xpath("//input[@id='male']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='tuesday']")).click();
	driver.findElement(By.xpath("//input[@id='friday']")).click();
	WebElement country = driver.findElement(By.xpath("//select[@class='custom-select']"));
	//Select ss=new Select(country);
	//ss.selectByValue("1");
	Actions ss=new Actions(driver);
	
	ss.sendKeys(Keys.ENTER).perform();
	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[8]")).click();
	//driver.close();
	
	
	
	
	
	
	
}}
