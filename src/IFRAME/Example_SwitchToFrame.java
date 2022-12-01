package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_SwitchToFrame {
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
	 
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	//click on data&time btn from  iframe
	//driver.switchTo().frame("iframeResult");
	//driver.switchTo().frame(0);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
}
}
