package mock_practice_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lo_Id {
	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver b=new ChromeDriver();
		b.get("file:///E:/new%20html%20code/byId.html");

		b.findElement(By.id("1234")).sendKeys("vishsl");
		b.findElement(By.id("145")).sendKeys("vishshshshshs");
	

}
}