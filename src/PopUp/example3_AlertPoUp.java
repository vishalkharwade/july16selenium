package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_AlertPoUp {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//enter id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("122");
	//enter submit btn
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert Alt = driver.switchTo().alert();
	String text = Alt.getText();
	System.out.println(text);
	
	
	//Alt.dismiss();
	Alt.accept();
	
	

}}
