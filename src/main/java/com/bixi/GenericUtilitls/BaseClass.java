package com.bixi.GenericUtilitls;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass 
{
	public DatabaseUtils dlib = new DatabaseUtils();
	public FileUtils flib = new FileUtils();
	public ExcelUtils elib = new ExcelUtils();
	public WebDriverUtils wlib = new WebDriverUtils();
	public WebDriver driver;
	public  static WebDriver sdriver;
	@BeforeSuite
	public void connect_DB() throws Throwable
	{
		dlib.connectDB();
	}
	
	@BeforeClass
	public void launch_Browser() throws Throwable 
	{
		String BROWSER = flib.readDataFromPropertyFILE("browser");
		if (BROWSER.equals("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if (BROWSER.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		
        sdriver=driver;
        
		wlib.maximizeWindow(driver);
		wlib.implicitlywait(driver, 20);
	
		
	}
	@BeforeMethod
	public void luanch_url() throws Throwable
	{
		String URL = flib.readDataFromPropertyFILE("url");
		driver.get(URL);
	}
	
	@AfterClass
	public void close_browser() 
	{
		wlib.closebrowser(driver);
	}
  

	@AfterSuite
	public void disconnect_DB() throws Throwable 
	{
		dlib.disconnectDB();

	}

	
	

}
