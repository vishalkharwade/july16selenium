package HandlingofList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example4_deselectionoptionFrom_MultiselectableListbox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///E:/new%20html%20code/LIstBobx.HTML");
		//Step:1
	WebElement country = driver.findElement(By.xpath("//select[@id='abc']"));
	//Step:2
	Select s=new Select(country);
	//Step:3
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(3);
	
	Thread.sleep(2000);
	
	s.deselectAll();
	
	
	
	
	
	
	

	
	
	
	

}}
