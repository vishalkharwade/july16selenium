package mock_practice_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath_text {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://www.facebook.com/");
		x.manage().window().maximize();
		Thread.sleep(2000);
		x.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		x.navigate().back();
		Thread.sleep(2000);
		x.quit()
;
		}

}
