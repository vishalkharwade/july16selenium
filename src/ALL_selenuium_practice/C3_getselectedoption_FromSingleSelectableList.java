package ALL_selenuium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C3_getselectedoption_FromSingleSelectableList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/new%20html%20code/state.html");
		WebElement state = driver.findElement(By.xpath("//select[@id='ABc']"));
		Thread.sleep(2000);
		Select s=new Select(state);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		List<WebElement> alloption = s.getAllSelectedOptions();
		for(WebElement s1:alloption) {
			System.out.println(s1.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}