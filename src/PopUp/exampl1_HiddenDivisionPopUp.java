package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampl1_HiddenDivisionPopUp {
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		 
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 //enter User name
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("vishal");
		 
		 //enter pass
		 driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Kshsh");
		 //click to login 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
		
		
		
		
	}
	
	
	
	

}
