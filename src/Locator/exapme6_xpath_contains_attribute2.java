package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exapme6_xpath_contains_attribute2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com//");
	driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("vihdk");
	
	driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("jsjs");
				

}}