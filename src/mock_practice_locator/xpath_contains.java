package mock_practice_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

             WebDriver w=new ChromeDriver();
	
            w.get("https://www.facebook.com/");
            Thread.sleep(2000);
            w.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")).click();
            Thread.sleep(2000);
            w.navigate().back();
            Thread.sleep(2000);
            w.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();
            Thread.sleep(2000);
            w.quit();
            
}
}