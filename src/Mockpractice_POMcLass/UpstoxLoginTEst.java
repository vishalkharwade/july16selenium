package Mockpractice_POMcLass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpstoxLoginTEst {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	
		
		
	
	FileInputStream file=new FileInputStream("D:\\16julyA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	
	
	UpstoxLogin1page log1=new UpstoxLogin1page(driver);
	log1.InpUpstoxLogin1pageUserName(sh.getRow(0).getCell(0).getStringCellValue());
	log1.inpUpstoxLogin1pagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	log1.clickUpstoxLogin1pageLoginbutton();
	
	UpstoxLogin2page log2=new UpstoxLogin2page(driver);
	log2.inpUpstoxLogin2pageBirthDate(sh.getRow(0).getCell(2).getStringCellValue());
	
	UpstoxWelcomePage log3=new UpstoxWelcomePage(driver);
	log3.clickUpstoxWelcomePageWelcome();
	
	UpstoxHomepage log4=new UpstoxHomepage(driver);
	log4.variyUpstoxHomepageUserID(sh.getRow(0).getCell(3).getStringCellValue());
	
	Thread.sleep(2000);
	driver.close();
	

	}
}