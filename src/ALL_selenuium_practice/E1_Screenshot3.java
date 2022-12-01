package ALL_selenuium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class E1_Screenshot3 
{

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		String rs = RandomString.make(2);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("D:\\screenshot\\visha"+rs+".jpg");
		 FileHandler.copy(source, dest);
		 driver.close();
		 
}

	
	
}