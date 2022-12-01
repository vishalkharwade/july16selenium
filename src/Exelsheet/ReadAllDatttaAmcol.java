package Exelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDatttaAmcol {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\\\16julyA.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		int lastRowindex = sh.getLastRowNum();		
		
		
		for(int i=0;i<=lastRowindex;i++) {
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}

}
