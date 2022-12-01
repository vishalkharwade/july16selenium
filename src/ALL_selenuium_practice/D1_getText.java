package ALL_selenuium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1_getText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver v1=new ChromeDriver();
		v1.get("https://www.facebook.com/");//get URL
		v1.findElement(By.xpath("//a[text()='Create New Account']")).click();

}
}