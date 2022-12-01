package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String Gettitle = driver.getTitle();
	driver.close();
	String expected = "facebook";
			if(expected.equals(expected)) {
				System.out.println("Both title match\rresult pass");
			}else {
				System.out.println("Both title notmatch\result fail");
			}
			
}

}
