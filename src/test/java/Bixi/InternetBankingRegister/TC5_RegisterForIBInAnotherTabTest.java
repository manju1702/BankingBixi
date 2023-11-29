package Bixi.InternetBankingRegister;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.IB_RegisterPage;
import com.bixi.GenericUtilitls.BaseClass;
import com.bixi.GenericUtilitls.ExcelUtils;
import com.bixi.GenericUtilitls.FileUtils;
import com.bixi.GenericUtilitls.JavaUtils;
import com.bixi.GenericUtilitls.WebDriverUtils;

public class TC5_RegisterForIBInAnotherTabTest extends BaseClass
{
@Test
	public  void ib_registerInAnotherTab() throws Throwable 
	{
       
		HomePage h = new HomePage(driver);
		h.scrollThePage(driver);
		h.mousehower_InternetBankingLink(driver);
		h.right_click(driver);
		h.windowHandle(driver);
		Thread.sleep(2000);
		elib.readMultipleData("Sheet3", driver);

		//WebElement DoB = driver.findElement(By.name("dob"));
		//DoB.click();
		IB_RegisterPage ib = new IB_RegisterPage(driver);
		ib.getDobTf().click();
		wlib.keyPressNumber(driver);
	    Thread.sleep(500);
		driver.findElement(By.name("submit")).click();

		String confirmationmsg = driver.switchTo().alert().getText();
		System.out.println(confirmationmsg);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		if (confirmationmsg.contains("Registration Successfull"))

			System.out.println("pass" + " customer id genrated and it is verified");
		else
			System.out.println("Fail");
		driver.quit();

	}
}
