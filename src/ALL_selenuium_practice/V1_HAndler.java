package ALL_selenuium_practice;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.collections4.list.TreeList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class V1_HAndler {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	
	Thread.sleep(3000);
	
	
	WebElement day = driver.findElement(By.xpath("//select[@id='month']"));
	
	
	Select s=new Select(day);	
	//s.selectByValue("2");
      List<WebElement> opt = s.getOptions();
 TreeList<String> tr = new TreeList<String>();
 for(WebElement o:opt) {
	 String str = o.getText();
	 tr.add(str);
 }


 }

}
      
      
      

