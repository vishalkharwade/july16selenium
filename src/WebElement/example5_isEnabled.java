package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver v1=new ChromeDriver();
	v1.get("https://www.facebook.com");
	
	boolean result =v1.findElement(By.xpath("//input[@name='email']")).isEnabled();
	System.out.println(result);

	if (result ==true) {
		System.out.println("element is enamble");
	}
	else {
		System.out.println("element is disabel");
	}
		
	}
	

}
