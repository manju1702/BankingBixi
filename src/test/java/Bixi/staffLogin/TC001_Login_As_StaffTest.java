package Bixi.staffLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.StaffLoginPage;
import com.bixi.GenericUtilitls.BaseClass;
import com.bixi.GenericUtilitls.FileUtils;

/**
 * 1.open browser enter test url
 * 2.click on staff login
 * 3.enter credential
 * 4.click on login
 * @author MANJU SAHU
 */
 //
@Listeners(com.bixi.GenericUtilitls.ListenerImpClass.class)
public class TC001_Login_As_StaffTest extends BaseClass
{
@Test(retryAnalyzer = com.bixi.GenericUtilitls.RetryImpClass.class)
public void staffLogin() throws Throwable
{
	String UN = flib.readDataFromPropertyFILE("username");
	String PWD = flib.readDataFromPropertyFILE("password");
	HomePage h = new HomePage(driver);
	h.getStaffLoginLink().click();
    Assert.fail();
	StaffLoginPage sf= new StaffLoginPage(driver);
	sf.loginAsStaff(UN, PWD);
	
}
}
