package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_SwitchTomainPageFromIFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		 
	
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
	
	
	
	
	
	
	
	
	

}
