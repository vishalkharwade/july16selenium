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

public class Ex_2_With_DDF {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Enter username
	String name = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(name);
	//Enter pass
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	
	
	//Enter on login btn
	
	driver.findElement(By.xpath("//input[@name='login-button']")).click();
	
	boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
	
	if(result==true) {
		
		System.out.println("Logo found -->TC pass");
	}else {
		System.out.println("Logo not found ---> TC fail");
	}
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}
