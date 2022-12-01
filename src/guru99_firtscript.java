import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99_firtscript {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

	WebDriver driver=new ChromeDriver();
	driver.get("https://clicks.aweber.com/y/ct/?l=OAxv4&m=mH.7pjbdt6yRDy9&b=pbEuHgWMqEnzTu4MLZenjQ");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr447920");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zugUjEq");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	//Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	
	
}
	
	
	
	
	
	
}
