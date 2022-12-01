package Exelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExampleRead_AllDataFromRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("D:\\\\16julyA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		 
		int lastcellIndex = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastcellIndex;i++) {
			Cell cellinfo = sh.getRow(i).getCell(i);
			CellType s1 = cellinfo.getCellType();
			if(s1==CellType.STRING) {
				String value = cellinfo.getStringCellValue();
				System.out.print(value+" ");
			}else if(s1==CellType.NUMERIC) {
				double value = cellinfo.getNumericCellValue();
				System.out.print(value+" ");
				
			}else if(s1==CellType.BOOLEAN) {
				boolean value = cellinfo.getBooleanCellValue();		
			System.out.print(value+" ");	
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
