package dataproviderProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bixi.GenericUtilitls.IpathConstants;

public class DataproviderExcelTest 
{
	
	@Test(dataProvider = "storeData")
	public void getData(String a, String b)
	{
		System.out.println(a+"====="+b);
	}
	
	
	
	@DataProvider
	public Object[][] storeData() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fi = new FileInputStream(IpathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Sheet3");
		int rowcount = sh.getPhysicalNumberOfRows();
		int cellcount = sh.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[rowcount][cellcount];
		
		for(int i =0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return obj;
	}
	
}
