package com.bixi.GenericUtilitls;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils 

{
	/**
	 * THIS METHOD IS USED TO READ THE DATA FROM PROPERTY FILE
	 * AUTHOR MANJU SAHU
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromPropertyFILE(String key) throws Throwable
	{
		FileInputStream fis =new FileInputStream(IpathConstants.filepath);
		Properties plib = new Properties();
		plib.load(fis);
		String value = plib.getProperty(key);
		return value;
		
	}

}
