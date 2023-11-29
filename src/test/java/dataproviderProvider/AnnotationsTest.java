package dataproviderProvider;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
	@Test
	public void testScriptTest()
	{
		System.out.println("");
	}
	@BeforeSuite
	public void config_BS()
	{
		System.out.println("---DB connection----");
	}
	@AfterSuite
	public void config_AS()
	{
		System.out.println("");
	}
	@BeforeClass
	public void config_BC()
	{
		System.out.println("");
	}

}
