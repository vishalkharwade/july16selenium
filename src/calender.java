import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class calender {
	
	WebDriver driver;
	

@Test
	public void calender() {
		
	System.setProperty("webdriver.chrome.driver",
			"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
	 driver=new ChromeDriver();
	 
	  driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	  
	 
while(true) {
	String ss = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	if(!ss.equalsIgnoreCase("January 2023")) {
		driver.findElement(By.xpath("//a[@title='Next']")).click();
	}else {
		break;
	}
}
	 int date=20;
	 driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a[text()='"+date+"']")).click();
	
}}
