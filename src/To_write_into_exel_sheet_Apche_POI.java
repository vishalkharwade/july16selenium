import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class To_write_into_exel_sheet_Apche_POI {
	
	
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			
			FileInputStream file=new FileInputStream("E:\\velocity _testing course\\data.xlsx");
			Workbook book=WorkbookFactory.create(file);
		    org.apache.poi.ss.usermodel.Sheet rw=book.getSheet("Sheet1");
		   
		    //To create new row -0
		    Row r1=rw.createRow(0);
		    
			//To enter data in to coloumns of row 0
			r1.createCell(0).setCellValue("Ketki");
			r1.createCell(1).setCellValue("Gawali");
			r1.createCell(2).setCellValue("QA");
			
			//To create second row -1
		    Row r2=rw.createRow(1);
		    
			//To enter data in to coloumns of row 1
			r2.createCell(0).setCellValue("Mahesh");
			r2.createCell(1).setCellValue("Gawali");
			r2.createCell(2).setCellValue("Director");
			
			
			  //write the data in excel using output stream
			FileOutputStream outputStream = new FileOutputStream("E:\\velocity _testing course\\data.xlsx");
			book.write(outputStream);
			book.close();
			
		}

	}

}
