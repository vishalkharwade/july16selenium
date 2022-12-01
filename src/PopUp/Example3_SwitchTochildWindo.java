package PopUp;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_SwitchTochildWindo {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\selenium\\\\new version\\\\chromedriver_win32\\\\chromedriver.exe" );
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		//click on "NEW TAB" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child windo ID
		Set<String> alllds = driver.getWindowHandles();
		ArrayList<String> Al=new ArrayList<String>(alllds);
		String childWindow = Al.get(1);
	
		//SWITCH TO CHILD WINDOW
		driver.switchTo().window(childWindow);//
		//click on 'Traning link from child window
		
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
