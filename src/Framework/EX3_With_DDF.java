package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX3_With_DDF {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	//enter user name
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(UN);
	
	//Enter pass
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);

	
	// Enter submit
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
	
	if(result==true) {
		System.out.println("Logo Founf--->TC pass");
		
	}
	else {
		System.out.println("Logo Not Fond--->TC Fail");
		
	}
Thread.sleep(3000);

	
	
	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Logout']")).click();
Thread.sleep(2000);
driver.close();
}
}