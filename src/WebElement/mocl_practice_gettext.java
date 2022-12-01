package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mocl_practice_gettext {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver v1=new ChromeDriver();
	v1.get("https://www.facebook.com");
	
	WebElement demo = v1.findElement(By.xpath("//h2[contains(text(),'Facebook ')]"));
	
	String actual=demo.getText();
	String Expected="Facebook helps you connect and share with the people in your life";
	if(actual.equals(Expected)) {
		System.out.println("path is correct");
	
	}else {
		System.out.println("path is not correct");
		
	}
	v1.manage().window().maximize();
}}
