package Autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	//Enter mobile name
		driver.findElement(By.xpath("gLFyf gsfi")).sendKeys("redmi");
		Thread.sleep(2000);
	
		List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]li"));
	String expttext = "remik50i";
	
	for(WebElement s1:alloption){
		String acttext = s1.getText();
		if(acttext.equals(expttext)) {
			s1.click();
			break;
		}
	}
	
	
	
	}

}
