import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampletest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	
	driver.get("https//.www.amazon.com");
}
}