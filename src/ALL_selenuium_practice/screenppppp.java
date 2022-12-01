package ALL_selenuium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenppppp {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(sr);
		String RR = RandomString.make(2);
		File D=new File("D:\\screenshot\\practice"
				+ ""+RR+".jpg");
		FileHandler.copy(sr, D);
		
	

	}

	
	}



