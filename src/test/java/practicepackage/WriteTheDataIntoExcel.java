package practicepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataIntoExcel 
{
	public static void main(String[] args) throws Throwable, Throwable 
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);	
		Sheet sh = wb.getSheet("Sheet6");
		sh.createRow(6).createCell(0).setCellValue("arpan simran anand");
		sh.getRow(6).createCell(1).setCellValue("automation testing engineer");
		sh.createRow(7).createCell(0).setCellValue("manju sahu");
		sh.getRow(7).createCell(1).setCellValue("automation testing engineer");		
		
		FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\testdata1.xlsx");
		wb.write(fout);
		wb.close();
	}

}
