package Mockpractice_POMcLass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
public static String getId(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("D:\\16julyA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
 String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
return value;
}
}