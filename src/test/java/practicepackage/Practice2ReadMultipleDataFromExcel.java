package practicepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice2ReadMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// write the data in single row and colom
		/*
		 * FileInputStream fis = new
		 * FileInputStream(".\\src\\test\\resources\\testdata1.xlsx"); Workbook wb =
		 * WorkbookFactory.create(fis); Sheet sh = wb.getSheet("Sheet3"); Row row1=
		 * sh.createRow(6); row1.createCell(5).setCellValue("name");
		 * row1.createCell(6).setCellValue("branch");
		 * row1.createCell(7).setCellValue("mobile number");
		 * 
		 * 
		 * Row row2= sh.createRow(7); row2.createCell(5).setCellValue("manju sahu");
		 * row2.createCell(6).setCellValue("electrical");
		 * row2.createCell(7).setCellValue("9109535631");
		 * 
		 * Row row3=sh.createRow(8); row3.createCell(5).setCellValue("ananya sahu");
		 * row3.createCell(6).setCellValue("machanical");
		 * row3.createCell(7).setCellValue("810657493"); FileOutputStream fout = new
		 * FileOutputStream(".\\src\\test\\resources\\testdata1.xlsx"); wb.write(fout);
		 */

		// write the data by using for loop and taking input from user
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("Sheet4");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 2; i++) 
		{
			Row currentrow =sh.createRow(i);
			for (int j = 0; j<3; j++) 
			{
				System.out.println("enter the value :");

				String value = sc.next();

				currentrow.createCell(j).setCellValue(value);
				System.out.print(value);

			}
			
		}
		
		System.out.println("writing done");
FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\testdata1.xlsx");
		wb.write(fout);
		wb.close();
	}
}
