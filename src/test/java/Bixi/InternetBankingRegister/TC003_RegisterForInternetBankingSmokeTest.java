package Bixi.InternetBankingRegister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.IB_RegisterPage;
import com.bixi.GenericUtilitls.BaseClass;
import com.bixi.GenericUtilitls.ExcelUtils;
import com.bixi.GenericUtilitls.FileUtils;
import com.bixi.GenericUtilitls.IpathConstants;
import com.bixi.GenericUtilitls.WebDriverUtils;

public class TC003_RegisterForInternetBankingSmokeTest extends BaseClass
{
	@Test
	public  void register_for_IB() throws Throwable {
		
		wlib.scrollBy(driver, 0, 500);
		Thread.sleep(2000);
		HomePage h = new HomePage(driver);
		h.mousehower_InternetBankingLink(driver);
		Thread.sleep(2000);

		String ACH = elib.readDataFromExcel("Sheet3", 0, 1);
		String ACNO = elib.readDataFromExcel("Sheet3", 1, 1);
		String DBNO = elib.readDataFromExcel("Sheet3", 2, 1);
		String PIN = elib.readDataFromExcel("Sheet3", 3, 1);
		String MOB = elib.readDataFromExcel("Sheet3", 4, 1);
		String PAN = elib.readDataFromExcel("Sheet3", 5, 1);
		String LAST = elib.readDataFromExcel("Sheet3", 6, 1);
		String PWD = elib.readDataFromExcel("Sheet3", 7, 1);
		String CPWD = elib.readDataFromExcel("Sheet3", 8, 1);
		Thread.sleep(2000);

		IB_RegisterPage R = new IB_RegisterPage(driver);
		R.sendkey_IBREGISTER(ACH, ACNO, DBNO, PIN, MOB, PAN, LAST, PWD, CPWD);
		Thread.sleep(2000);
		// R.IB_REGISTER_datePopup(driver);
		IB_RegisterPage ib = new IB_RegisterPage(driver);
		ib.getDobTf().click();
		// WebElement DoB = driver.findElement(By.name("dob"));
		// DoB.click();
		Thread.sleep(1000);
		wlib.keyPressNumber(driver);
		Thread.sleep(2000);
		ib.getSubmit_Btn().click();
		//validation of popup

	}

}
