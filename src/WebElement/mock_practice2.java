package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock_practice2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		WebElement demo = driver.findElement(By.xpath("//span[contains(text(),'Log in with Facebook')]"));
		
		String actual = demo.getText();
		
		String expected = "Log in with Facebook";
		if(actual.equals(expected)) {
			System.out.println("path is corrext");
		}else {
			System.out.println("path is not correct");
		}
		
	}

}
