package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class example7_isSelected {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	WebElement femaleradioBtn=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
  boolean result1=femaleradioBtn.isSelected();
	if(result1 ==true) {
		System.out.println("radio Btn already selected");
	}
	else {
		System.out.println("radio btmde-selected");
		femaleradioBtn.click();
		boolean result2=femaleradioBtn.isSelected();
		if(result2==true) {
			System.out.println("radio Btn selected");
		}else
		{
			System.out.println("radio buttum d slected");
		}
	}
	
}}
