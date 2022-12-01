package Handling_multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getCountofAllLinkFromacwbook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	
	int count = alllinks.size();
	System.out.println(count);
	}

	
	
	
	


}