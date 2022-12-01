package Exelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exaample8_GetCelltype {public static void main(String[] args) throws EncryptedDocumentException, IOException {
	

	
	FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
	double sh = WorkbookFactory.create(file).getSheet("sheet2").getRow(0).getCell(2).getNumericCellValue();
	
	System.out.println(sh);
	

}
}