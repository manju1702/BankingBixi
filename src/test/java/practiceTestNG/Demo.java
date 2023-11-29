package practiceTestNG;

import org.testng.annotations.Test;

import com.bixi.GenericUtilitls.BaseClass_Sample;

public class Demo extends BaseClass_Sample
{
	@Test(groups = {"smoke","regression"})
	
	public void m1()
	{
	System.out.println("execute the m1");	
	}
	@Test(groups = "smoke")
	public void n1()
	{
		System.out.println("execute the n1");
	}

}
