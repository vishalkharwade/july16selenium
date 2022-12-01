package ALL_selenuium_practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G1_POUP {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Vhdh");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//driver.switchTo().alert().accept();
		
		
	driver.switchTo().alert().dismiss();
	
}
}