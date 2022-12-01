package ALL_selenuium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class E1_Screenshot2 {
public static void main(String[] args) throws IOException {
	

	System.setProperty("webdriver.chrome.driver", 
			"D:\\selenium\\chromedriver_win32\\\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.jnj.in/");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	File Dest=new File("D:\\screenshot\\vishal.jpg");
	
	FileHandler.copy(source, Dest);
	
	
	
	
	
	
	
}}
