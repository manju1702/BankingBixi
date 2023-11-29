package dataproviderProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationScenarioBasedQuestion 
{
	@BeforeSuite
	public void config_BS()
	{
		System.out.println("CONNECT TO DATABASE");
	}
   @BeforeClass
   public void config_BC()
   {
	   System.out.println("LAUNCH THE BRAOWSER");
   }
   @BeforeClass
   public void config_BC1()
   {
	   System.out.println("AGAIN LAUNCH THE BROWSER");
   }
   @BeforeMethod
   public void config_BM1()
   {
	   System.out.println("LOGIN1 THE APPLICATION");
   }
   @Test
   public void testscript1()
   {
	   System.out.println("testscript1");
   }
   
   @AfterMethod
   public void config_AM1()
   {
	   System.out.println("LOGOUT1 ");
   }
   @BeforeMethod
   public void config_BM3()
   {
	   System.out.println("LOGIN3 THE APPLICATION");
   }
   @Test
   public void testscript3()
   {
	   System.out.println("testscript3");
   }
   
   @AfterMethod
   public void config_AM2()
   {
	   System.out.println("LOGOUT3 ");
   }
   @BeforeMethod
   public void config_BM2()
   {
	   System.out.println("LOGIN2 THE APPLICATION");
   }
   @Test
   public void testscript2()
   {
	   System.out.println("testscript2");
   }
   
   @AfterMethod
   public void config_AM3()
   {
	   System.out.println("LOGOUT3 ");
   }
   
   
   @AfterClass
   public void config_AC()
   {
	   System.out.println("CLOSE THE BROWSER");
   }
   @AfterSuite
   public void config_AS()
   {
	  System.out.println("DISCONNECT TO DATABASE"); 
	   
   }
   

}
