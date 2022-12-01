package ALL_selenuium_practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2_mainpageToChildClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> IDC = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(IDC);
		String childwindo = al.get(1);
		driver.switchTo().window(childwindo);
		
		
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
	}

}
