package ALL_selenuium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_practice1 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver v1=new ChromeDriver();
			v1.manage().window().maximize();
		v1.get("https://vctcpune.com/selenium/practice.html");
		
			
			WebElement showbutton = v1.findElement(By.id("show-textbox"));
showbutton.click();
Thread.sleep(2000);
WebElement hidebutton = v1.findElement(By.id("hide-textbox"));
//hidebutton.click();
Thread.sleep(2000);
 WebElement displayedtext = v1.findElement(By.id("displayed-text"));
 displayedtext.sendKeys("hello");
 Thread.sleep(2000);
 hidebutton.click();
}}
