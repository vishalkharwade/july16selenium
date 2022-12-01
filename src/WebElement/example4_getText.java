package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_getText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver v1=new ChromeDriver();
		v1.get("https://www.facebook.com");
		
WebElement demo = v1.findElement(By.xpath("//a[text()='Forgotten password?']"));
	
		String it = demo.getText();
		String expe = "Forgotten password?";
	
		if(it.equals(expe)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}

}
