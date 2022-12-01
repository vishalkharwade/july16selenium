package full_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\new version\\chromedriver_win32\\chromedriver.exe" );
		
	
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File src = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make();
		File dest=new File("C:\\Users\\DELL\\eclipse-workspace\\16jul6 selenium\\Screenshot\\vish"+str+".jpg");
		
		FileHandler.copy(src, dest);
	}

}
