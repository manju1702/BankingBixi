package TestYanraPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataIntoExcel03 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\PracticeExcelSheet.xlsx");
	Workbook wb=	WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("manju");
	sh.createRow(0).createCell(0).setCellValue("account holder name");
	sh.getRow(0).createCell(1).setCellValue("manju sahu");
	sh.createRow(1).createCell(0).setCellValue("account number");
	sh.getRow(1).createCell(1).setCellValue("345678901");
	sh.createRow(2).createCell(0).setCellValue("debit card no");
	sh.getRow(2).createCell(1).setCellValue("34364772445");
	
	FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\PracticeExcelSheet.xlsx");
	wb.write(fout);
	wb.close();
	}

}
