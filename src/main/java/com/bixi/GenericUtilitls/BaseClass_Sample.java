package com.bixi.GenericUtilitls;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.StaffLoginPage;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;

	public class BaseClass_Sample
	{
		public DatabaseUtils dlib = new DatabaseUtils();
		public FileUtils flib = new FileUtils();
		public ExcelUtils elib = new ExcelUtils();
		public WebDriverUtils wlib = new WebDriverUtils();
		public WebDriver driver;
		
		@BeforeSuite
		public void config_BS() throws Throwable
		{
			dlib.connectDB();
			System.out.println("--connected to DB--");
		}
		
		
		@Parameters("BROWSER")
		@BeforeClass(alwaysRun = true)
		public void config_BC(String BROWSER) throws Throwable
		{
			//String BROWSER = flib.readDataFromPropertyFILE("browser");
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if (BROWSER.equalsIgnoreCase("firefox")) 
			{
				driver = new FirefoxDriver();
			}
			else 
			{
				System.out.println("--Invalid browser--");
			}
			wlib.maximizeWindow(driver);
		}
		
		@BeforeMethod
		public void config_BM() throws Throwable
		{
			String URL = flib.readDataFromPropertyFILE("url");
			//username
			//password
			
			driver.get(URL);
			wlib.waitForPageLoad(driver, 10);
			
		}
		@Test
		public void staffLogin() throws Throwable
		{
			FileUtils fi = new FileUtils();
			String URL = fi.readDataFromPropertyFILE("url");
			String UN = fi.readDataFromPropertyFILE("username");
			String PWD = fi.readDataFromPropertyFILE("password");
			
			WebDriver driver = new ChromeDriver();
			driver.get(URL);
			HomePage h = new HomePage(driver);
			h.getStaffLoginLink().click();
			StaffLoginPage sf= new StaffLoginPage(driver);
			sf.loginAsStaff(UN, PWD);
			
		}
		
		@AfterMethod
		public void config_AM()
		{
			driver.manage().window().minimize();
			//logout from application
		}
		
		@AfterClass
		public void config_AC()
		{
			driver.quit();
		}
		
		@AfterSuite
		public void config_AS()
		{
			//disconnect database
		}
		
	}


