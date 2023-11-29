package dataproviderProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleDemoAnnotationExecution 
{
	@BeforeSuite
	public void suit1()
	{
		System.out.println("database connection1");
	}
	@BeforeClass
	public void sampleclass()
	{
		System.out.println("launch the browse2");
	}
	@BeforeMethod
	public void loginAppl1()
	{
		System.out.println("login to application for sample method3");
	}
	@Test
	public void executesample()
	{
		System.out.println("executesample5");
	}
	@AfterMethod
	public void logout1()
	{
		System.out.println("logout to application for sample 6");
	}
	@BeforeMethod
	public void login2()
	{
		System.out.println("login in Demo class");
	}
	@Test
	public void testscript2()
	{
		System.out.println("execute demo class");
	}
	@AfterMethod
	public void logout2()
	{
		System.out.println("logout in demo class");
	}
	 
	 
	 
	 
	
	@AfterSuite
	public void disconnectDatabase()
	{
		System.out.println("disconnect to the database");
	}
	
	

}
