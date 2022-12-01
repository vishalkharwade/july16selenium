package ALL_selenuium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.netflix.com/");
	File psrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(psrc);
	 String v = RandomString.make(1);
	File dest=new File("D:\\screenshot\\v1"+v+".jpg");
	FileHandler.copy(psrc, dest);
	
	}

}
