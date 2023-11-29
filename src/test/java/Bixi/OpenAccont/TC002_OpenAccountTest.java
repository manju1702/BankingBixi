package Bixi.OpenAccont;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.OpenAccountPage;
import com.bixi.GenericUtilitls.BaseClass;
import com.bixi.GenericUtilitls.ExcelUtils;
import com.bixi.GenericUtilitls.FileUtils;
import com.bixi.GenericUtilitls.WebDriverUtils;

/*1.open the browser enter the url
 * 2.click on open account lin
 * 3.enter credentials in required textfield
 * 4.click on submit
 * 
 */
@Listeners(com.bixi.GenericUtilitls.ListenerImpClass.class)
public class TC002_OpenAccountTest extends BaseClass
{
@Test 
	public  void applyForNewBankAccount() throws Throwable 
{
		
		String URL = flib.readDataFromPropertyFILE("url");

		// launch the browseR
		WebDriver driver = new ChromeDriver();
		// maximize the browser 
		wlib.maximizeWindow(driver);
		wlib.implicitlywait(driver, 20);
		// trigger the url
		driver.get(URL);
		wlib.waitForPageLoad(driver, 20);
		HomePage h = new HomePage(driver);
		h.getOpenAccountLink().click();
		Thread.sleep(1000);
		String NAME = elib.readDataFromExcel("Sheet2", 0, 1);
		String MOB = elib.readDataFromExcel("Sheet2", 1, 1);
		String EMAIL = elib.readDataFromExcel("Sheet2", 2, 1);
		String LANDLINE = elib.readDataFromExcel("Sheet2", 3, 1);
		String PAN = elib.readDataFromExcel("Sheet2", 4, 1);
		String CITIZEN = elib.readDataFromExcel("Sheet2", 5, 1);
		String HOME = elib.readDataFromExcel("Sheet2", 6, 1);
		String OFFICE = elib.readDataFromExcel("Sheet2", 7, 1);
		String PIN = elib.readDataFromExcel("Sheet2", 8, 1);
		String AREA = elib.readDataFromExcel("Sheet2", 9, 1);
		String NOMINEE = elib.readDataFromExcel("Sheet2", 10, 1);
		String NOMINEEACNO = elib.readDataFromExcel("Sheet2", 11, 1);
		
        Thread.sleep(1000);
		OpenAccountPage op = new OpenAccountPage(driver);
		op.SENDKEYS_OA_Textfield(NAME, MOB, EMAIL, LANDLINE, PAN, CITIZEN, HOME, OFFICE, PIN, AREA, NOMINEE, NOMINEEACNO);
		Thread.sleep(2000);
		
		String GENDER = elib.readDataFromExcel("Sheet4", 0, 1);
		Thread.sleep(1000);
		String STATE = elib.readDataFromExcel("Sheet4", 1, 1);
		Thread.sleep(1000);
		String CITY = elib.readDataFromExcel("Sheet4", 2, 1);
		Thread.sleep(1000);
		String ACC = elib.readDataFromExcel("Sheet4", 3, 1);
		
		elib.readMultipleData("Sheet2", driver);
		
		
		op.openAccount_Dropdown(GENDER, STATE, CITY, ACC);
		Thread.sleep(1000);
		//op.openAccount_datePopup(wlib, driver);
		op.getDobTf().click();
		String DOB =elib.readDataFromExcel("Sheet2", 13, 1);
		op.sendkeys_date(DOB);
		Thread.sleep(2000);
		//op.getDobTf().sendKeys("17021885");
		//Thread.sleep(1000);
		op.getSubmitBtn().click();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
