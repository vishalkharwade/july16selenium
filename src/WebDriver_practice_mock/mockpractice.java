package WebDriver_practice_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mockpractice {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver v1=new ChromeDriver();
		v1.get("https://www.facebook.com");
		//v1.findElement(By.xpath("//input[@name='email']")).sendKeys("vishalkharwade07@gmail.com")	;	
	//	v1.findElement(By.xpath("//input[@id='pass']")).sendKeys("vishalkh");
		//v1.findElement(By.xpath("//button[@name='login']")).click();
		
		v1.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("vid");
;	
v1.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("hdd");

	}
	
	

}
