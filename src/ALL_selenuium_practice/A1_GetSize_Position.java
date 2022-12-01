package ALL_selenuium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_GetSize_Position {
	
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		System.out.println("size of browser:"+driver.manage().window().getClass());
		System.out.println("position of browser:"+driver.manage().window().getPosition());

}}
