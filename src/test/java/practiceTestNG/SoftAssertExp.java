package practiceTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExp {
	@Test
	public void softAssertTest()
	{
		
		SoftAssert sa = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/customer_reg_form.php");
		String exp ="Registration For"; //wrong title
		String act = driver.getTitle();
		sa.assertEquals(act, exp,"open account page title is not matched");
		System.out.println("soft assert");
	}
	@Test
	public void hardAssertTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/customer_reg_form.php");
		String exp ="Registration For"; //wrong title
		String act = driver.getTitle();
		Assert.assertEquals(act, exp,"open account page title is not matched");
		System.out.println("hard assert");
		
	}

}
