package Handling_multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_SelectAllcheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/alllinkhandlibg.html");
	List<WebElement> Allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	for(WebElement s1:Allcheckbox) {
		s1.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
	}
	
	
	
	

}
