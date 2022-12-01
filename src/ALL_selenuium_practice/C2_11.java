package ALL_selenuium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C2_11 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/new%20html%20code/state.html");
	WebElement state = driver.findElement(By.xpath("//select[@id='ABc']"));
	
	Select s=new Select(state);
	s.selectByIndex(2);
	
	Thread.sleep(2000);
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result==true) {
		System.out.println("LISt box is multi-selected");
		
	}else {
		System.out.println("List box not Multi-selected");
	}
	
	
}
}