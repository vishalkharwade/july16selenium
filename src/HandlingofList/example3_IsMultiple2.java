package HandlingofList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class example3_IsMultiple2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///E:/new%20html%20code/LIstBobx.HTML");
	
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='abc']"));
		Select s=new Select(selectCountry);
		s.selectByIndex(2);
		s.selectByIndex(3);
		s.selectByVisibleText("ind");
		Thread.sleep(2000);
	//s.deselectByIndex(2);
		
		s.deselectAll();
}
}