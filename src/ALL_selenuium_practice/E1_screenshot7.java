package ALL_selenuium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class E1_screenshot7 {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		driver.manage().window().maximize();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		String A = RandomString.make(3);
		File Dest=new File("D:\\\\screenshot\\\\new01"+A+".jpg");
		FileHandler.copy(source, Dest);
		
		
	}

}
