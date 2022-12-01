package HandlingofList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class example2_selectionoptionFrom_MultilectableLISTBOX {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///E:/new%20html%20code/LIstBobx.HTML");
	WebElement selectcountry = driver.findElement(By.xpath("//select[@id='abc']"));
		 Select s=new Select(selectcountry);
		 s.selectByVisibleText("ind");
		 s.selectByIndex(2);
		 s.selectByVisibleText("pak");
		 s.selectByValue("");
	}

}
