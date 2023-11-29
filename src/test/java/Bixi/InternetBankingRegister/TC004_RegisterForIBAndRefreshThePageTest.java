package Bixi.InternetBankingRegister;

import org.testng.annotations.Test;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.IB_RegisterPage;
import com.bixi.GenericUtilitls.BaseClass;

public class TC004_RegisterForIBAndRefreshThePageTest extends BaseClass {
	@Test
	public void IB_RegisterAndRefreshPage() throws Throwable {

		wlib.scrollBy(driver, 0, 500);
		HomePage h = new HomePage(driver);
		h.mousehower_InternetBankingLink(driver);
		wlib.scrollBy(driver, 0, 500);
        int count = elib.getLastRowNo("Sheet3");
		Thread.sleep(2000);
		elib.readMultipleData("Sheet3", driver);
		IB_RegisterPage ib = new IB_RegisterPage(driver);
		ib.getDobTf().click();
		wlib.keyPressNumber(driver);
		wlib.refresh(driver);
		driver.quit();

	}

}
