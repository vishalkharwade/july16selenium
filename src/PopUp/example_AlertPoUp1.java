package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_AlertPoUp1 {
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		 
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("122");
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();

	//clicl on cancle button 
	//driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	//click on okk button on popup
	
	driver.switchTo().alert().accept();
	
	//click on okk buttonfrom2nd  alert popup
	Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
}
}