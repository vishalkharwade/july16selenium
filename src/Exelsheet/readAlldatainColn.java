package Exelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readAlldatainColn {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\16julyA.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		
		
		int lastindex = sh.getLastRowNum();
		
		for(int j=0;j<=lastindex;j++) {
			int ststs = sh.getRow(j).getLastCellNum()-1;
			for(int i=0;i<=ststs;i++) {
				String value = sh.getRow(j).getCell(i).getStringCellValue();
				System.out.print(value+" ");
			}System.out.println();
		}
	}

}
