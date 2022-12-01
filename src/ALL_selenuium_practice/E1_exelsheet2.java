package ALL_selenuium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class E1_exelsheet2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
		
		int lastcelln = WorkbookFactory.create(file).getSheet("sheet2").getLastRowNum();
		
		System.out.println(lastcelln+1);
	}

}
