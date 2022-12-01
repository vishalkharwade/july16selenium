package HandlingofList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example9_Getsize_Allselectionoption {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///E:/new%20html%20code/LIstBobx.HTML");
		//Step:1
	WebElement country = driver.findElement(By.xpath("//select[@id='abc']"));
	
	
	
	Select s=new Select(country);
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(0);
	//int size = s.getAllSelectedOptions().size();
	//System.out.println(size);
	List<WebElement> Alloption = s.getAllSelectedOptions();
	int size = Alloption.size();
	System.out.println(size);
	}

}
