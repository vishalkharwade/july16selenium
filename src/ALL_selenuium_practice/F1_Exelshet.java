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

public class F1_Exelshet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");	
Workbook value = WorkbookFactory.create(file);
		
Sheet ss = value.getSheet("sheet1");
Row A = ss.getRow(0);
Cell W = A.getCell(0);
String A1 = W.getStringCellValue();
System.out.println(A1);


	}
	
	
	
	
	
	

}
