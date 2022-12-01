package PopUp;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWitch_MAin_PAGETO_ChildPAgr {
	
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver",
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			driver.get("https://skpatro.github.io/demo/links/");
			
			//click new tb from page 
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();	
			
			//get child windo ID
			Set<String> AKKA = driver.getWindowHandles();
			//{main page to chil page}
			ArrayList<String> AALL=new ArrayList<String>(AKKA);
			 driver.switchTo().window(AALL.get(1));
			 //click on tranning lik from child windo
			 
			 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
			 
			 //switch to main page
			 driver.switchTo().window(AALL.get(0));
			 //String manin page ID 
			 
			 Thread.sleep(3000);
			 
			 //click on New  window form mian page 
			  driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	

}
