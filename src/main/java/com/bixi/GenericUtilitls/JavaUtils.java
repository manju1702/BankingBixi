package com.bixi.GenericUtilitls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils {
	public int getRandomNo()
	{
		Random ran = new Random();
		int random = ran.nextInt();
		return random;
	}
	/**
	 * this method is used to get the system date
	 * @return
	 */
	public String systemDate()
	{
		Date date = new Date();
		String systemdate= date.toString();
		return systemdate;
	}
	public String systemDateInFormate()
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
		Date date = new Date();
		String systemdateformat = dateformat.format(date);
		return systemdateformat;
	}

}
