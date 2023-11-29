package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeRetryTest 
{
	@Test(retryAnalyzer =com.bixi.GenericUtilitls.RetryImpClass.class)
	public void practiceRetry()
	{
		System.out.println("---execution strats---");
		Assert.fail();
	}

}
