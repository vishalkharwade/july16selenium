package Exelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class examle1_getStringdataFromExelsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("D:\\16julyA.xlsx");
	
	Workbook book = WorkbookFactory.create(file);
	
	Sheet sh = book.getSheet("sheet1");
    Row row = sh.getRow(0);
    Cell cl = row.getCell(0);
    String value = cl.getStringCellValue();
    System.out.println(value);
}
}

