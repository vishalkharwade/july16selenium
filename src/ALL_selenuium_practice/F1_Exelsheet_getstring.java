package ALL_selenuium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class F1_Exelsheet_getstring {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
	Workbook str = WorkbookFactory.create(file);
		Sheet sh = str.getSheet("sheet1");
		Row row = sh.getRow(1);
		Cell value = row.getCell(0);
		String AA = value.getStringCellValue();
		System.out.println(AA);
		
		
		
	
		
	

	
		
	}

	
	
	

}
