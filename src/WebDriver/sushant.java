package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sushant {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver pawar=new ChromeDriver();
		pawar.get("https://www.mpsc.com/");
	}

}
