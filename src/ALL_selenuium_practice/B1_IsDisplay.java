package ALL_selenuium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_IsDisplay {
	

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver v1=new ChromeDriver();
			v1.manage().window().maximize();
		v1.get("https://vctcpune.com/selenium/practice.html");
		 v1.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		 v1.findElement(By.id("autocomplete")).sendKeys("india");
		
}
}
