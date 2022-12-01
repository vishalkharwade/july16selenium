package ALL_selenuium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class E1_exelsheet8 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
		short lastcolumn = WorkbookFactory.create(file).getSheet("sheet2").getRow(1).getLastCellNum();
		
		
		System.out.println(lastcolumn);
	}    
	

}
