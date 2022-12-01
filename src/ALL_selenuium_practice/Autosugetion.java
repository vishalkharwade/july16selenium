package ALL_selenuium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugetion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		Thread.sleep(2000);
		List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G41f7e'])[1]/li"));
		String expetext = "redmi note 8";
		
		for(WebElement s1:alloption) {
			String acttext = s1.getText();
			if(acttext.equals(expetext)) {
				s1.click();
				break;
			}
		}
	}

}
