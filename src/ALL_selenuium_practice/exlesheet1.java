package ALL_selenuium_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exlesheet1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("D:\\16julyA.xlsx");
		
		
	//String value = WorkbookFactory.create(file).getSheet("sheet3").getRow(3).	
	//		getCell(0).getStringCellValue();
	
	//System.out.println(value);
		
		//RowSize
		//int rowsize = WorkbookFactory.create(file).getSheet("sheet3").getLastRowNum()+1;	
	//System.out.println(rowsize);
	//colsize
	//short col = WorkbookFactory.create(file).getSheet("sheet3").getRow(0).getLastCellNum();
	
	//System.out.println(col);
		
	Sheet xx = WorkbookFactory.create(file).getSheet("sheet3");
		
		
	
	int last = xx.getLastRowNum();
	
	for(int i=0;i<=last;i++) {
		int lcellno = xx.getRow(i).getLastCellNum()-1;
		
		for(int j=0;j<=lcellno;j++) {
			String value = xx.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}System.out.println();
	}
	
	
	
	
	}
		
		
		
		
		
		
		
	}



			
			
