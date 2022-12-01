package ALL_selenuium_practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class haddlelist {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///E:/new%20html%20cod e/LIstBobx.HTML");
	WebElement selectcountry = driver.findElement(By.xpath("//select[@id='abc']"));
	 Select ss=new Select(selectcountry);
	List<WebElement> opt = ss.getOptions();
			 TreeSet<String> tr = new TreeSet<String>();
	for(WebElement o:opt) {
	String str = o.getText();
		System.out.println(str);
		
	}
	
}
}