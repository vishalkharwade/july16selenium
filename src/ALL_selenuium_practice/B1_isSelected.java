package ALL_selenuium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_isSelected {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver v1=new ChromeDriver();
		v1.get("https://www.facebook.com");
		
		v1.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement BB = v1.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		
	
	System.out.println(BB.isSelected());
	

}}
