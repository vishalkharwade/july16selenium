package selfpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
	
	public static String getId(int rowIndex ,int cellIndex ) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\16julyA.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	public static void capturescreenshot(WebDriver driver,int TCID) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File dest=new File("D:\\screenshot\\vshal"+TCID+".jpg");
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	
	}

}
