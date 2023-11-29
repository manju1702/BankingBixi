package practiceTestNG;

import org.testng.annotations.Test;

import com.bixi.GenericUtilitls.BaseClass_Sample;

public class Sample extends BaseClass_Sample
{
	@Test(groups = {"sanity","regression"})
	public void s1()
	{
		System.out.println("execute  s1 class sample");
	}
	@Test(groups = "smoke")
	public void s2()
	{
		System.out.println("execute s2 class sample");
	}
	

}
