package com.bixi.GenericUtilitls;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtils
{
	/**
	 * this method is used to read the data from excel
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcel(String sheetName,int row,int cell) throws Throwable
	{
		FileInputStream fi = new FileInputStream(IpathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		String value = sh.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	/**
	 * this method is used to get the toal rowcount
	 * @param sheetName
	 
	 
	 * @return
	 * @throws Throwable
	 */
	public int getLastRowNo(String sheetName) throws Throwable
	{
		FileInputStream fi = new FileInputStream(IpathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int count = sh.getLastRowNum();
		return count;
	}
	
	/**
	 * this method is used to write the data into excel
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * 
	 */
	public void writeDataIntoExcel(String sheetName,int row,int cell,String data) throws Throwable
	{
		FileInputStream fi = new FileInputStream(IpathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		sh.createRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fout = new FileOutputStream(IpathConstants.excelpath);
		wb.write(fout);
		wb.close();
		
	}
	public void readMultipleData(String sheetName,WebDriver driver)throws Throwable
	{
	
		FileInputStream fi= new FileInputStream(IpathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int count = sh.getLastRowNum();	
		HashMap<String, String> map = new HashMap<String, String>(); //empty
		for(int i=0;i<=count; i++)
		{
			String key = sh.getRow(i).getCell(0).getStringCellValue(); //reading the data one by one
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);  // store the key , value in empty map
			
		}
		// entering the data
		for(Entry<String, String> set: map.entrySet())
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
		
		
		
	}

}

