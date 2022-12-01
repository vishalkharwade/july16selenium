package HandlingofList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_isMultiple2 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///E:/new%20html%20code/LIstBobx.HTML");
		//Step:1
	WebElement country = driver.findElement(By.xpath("//select[@id='abc']"));
	
	Select s=new Select(country);
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result==true) {
		System.out.println("Listbox is of multi-selected");
	}
	else {
		System.out.println("Listbox is of sinle-selected");
	}

	}}
