import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender2 {
	
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true)
		{
		String s=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		if(!s.equalsIgnoreCase("January 2023"))
		{
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		 else
		 {
		break;
		 }
		}
		int date=20;
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a[text()='"+date+"']")).click();
		//driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td//a[text()='20']")).click();
}

}
