package ALL_selenuium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ZZ_exelsheer {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
		
		
		String sh = WorkbookFactory.create(file).getSheet("sheet3").getRow(2).getCell(1).getStringCellValue();
		
		
		System.out.println(sh);
		
	}
	
	
	
	

}
