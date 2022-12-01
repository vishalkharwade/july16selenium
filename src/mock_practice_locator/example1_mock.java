package mock_practice_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_mock {
	
	public static void main(String[] args) throws InterruptedException {
		
		


System.setProperty("webdriver.chrome.driver",
		"D:\\selenium\\chromedriver_win32\\chromedriver.exe" );


WebDriver v1=new ChromeDriver();
v1.get("https://login.yahoo.com/?.intl=in");
v1.manage().window().maximize();
Thread.sleep(2000);
v1.findElement(By.xpath("//input[@name='username']")).sendKeys("vishalkharwade");
Thread.sleep(2000);
//v1.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
v1.findElement(By.id("createacc")).click();
Thread.sleep(1000);

v1.findElement(By.name("firstName")).sendKeys("visshal");
	}}