package full_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelect {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe" );
		
	
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

Thread.sleep(1000);
WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
Select D=new Select(Day);
D.selectByValue("5");
WebElement FIRST = D.getFirstSelectedOption();
System.out.println("first option:"+FIRST.getText());
}}
