package ALL_selenuium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class F1_exelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
	boolean value = WorkbookFactory.create(file).getSheet("sheet2").getRow(0).getCell(3).getBooleanCellValue();
		System.out.println(value);
		
	}	

}
