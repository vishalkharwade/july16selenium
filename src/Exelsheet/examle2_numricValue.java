package Exelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class examle2_numricValue {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
	
double str = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1)
.getNumericCellValue();
	
	System.out.println(str);
	
}	

	

}
