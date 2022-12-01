package ALL_selenuium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_getitlemethod {

	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		
		String Gettitile = driver.getTitle();	
		String Expected = "Facebook – log in or sign up";
	System.out.println(Gettitile);
if(Expected.equals(Gettitile)) {
	System.out.println("pass");
}else {
	System.out.println("fail");
}
	
}


}
