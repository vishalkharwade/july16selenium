package ALL_selenuium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 
	 Thread.sleep(2000);
	 //step;1
	 
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	//Step:2
Select ss=new Select(month);

//ss.selectByIndex(0);
//ss.selectByValue("6");
//ss.selectByVisibleText("Sep");
List<WebElement> multipleoption = ss.getOptions();
for(WebElement s1:multipleoption) {
	System.out.println(s1.getText());
}

}}
