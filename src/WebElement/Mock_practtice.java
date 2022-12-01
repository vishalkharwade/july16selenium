package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock_practtice {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");WebDriver driver=new ChromeDriver();
		driver.get("https://upstox.com/trade/");
		WebElement demo = driver.findElement(By.xpath("//h3[contains(text(),'Pro tools built for pro traders')]"))
;
		String actual = demo.getText();
		String expected = "Pro tools built for pro traders";
		if(actual.equals(expected)) {
			System.out.println("path is correct");
		}else {
			System.out.println("path is not correct");
		}
	}
	

}
