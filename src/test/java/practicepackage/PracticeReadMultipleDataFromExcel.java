package practicepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PracticeReadMultipleDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet2");
		int rowcount = sh.getLastRowNum();
		 int cellcount = sh.getRow(0).getLastCellNum();
		 for(int i = 0; i<=rowcount;i++)
		 {
			 for(int j=0;j<cellcount; j++)
			 {
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value);
			System.out.print(" ");
			
			
			 }
			 System.out.println();
		 }
	}
}
