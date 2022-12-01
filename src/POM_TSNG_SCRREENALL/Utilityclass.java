package POM_TSNG_SCRREENALL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass {
	
	public static String getId(int rowindex ,int cellindex ) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\16jul6 selenium\\TestData\\16julyA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
	return value;
	
	}
	public static void FailtestScreenshot(WebDriver driver ,int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\FailedTestScreenshot\\vishal12"+TCID+".jpg");
		FileHandler.copy(src, dest);
	
	}
	public static String getpropertFileData(String key) throws IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\16jul6 selenium\\propertyfile.proprties");
	
	Properties p=new Properties();
	 p.load(file);
	 
	String value = p.getProperty(key);
	return value;
			
}
}