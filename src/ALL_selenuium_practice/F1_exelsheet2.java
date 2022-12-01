package ALL_selenuium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class F1_exelsheet2 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\\\16julyA.xlsx");
		
		
	Workbook book = WorkbookFactory	.create(file);
	String AA = book.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(AA);
	}


}
