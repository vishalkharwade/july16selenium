package ALL_selenuium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class E1_screenshot8 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/India");
		driver.manage().window().maximize();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		String RR = RandomString.make(2);
		File DEst=new File("D:\\screenshot\\start01"+RR+".jpg");
		FileHandler.copy(source, DEst);
		
		
		
		
		
		
		
	}
	

}
