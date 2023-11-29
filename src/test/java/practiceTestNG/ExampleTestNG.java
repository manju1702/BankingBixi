package practiceTestNG;

import org.testng.annotations.Test;

public class ExampleTestNG 
{
	@Test(dependsOnMethods = "delete")
	public void create() 
	{
System.out.println("create test");
	}
@Test
	public void edit() {
System.out.println("edit test");
	}
@Test(enabled = false)  //depandant method
	public void delete() 
	{
System.out.println("delete test");
	}
}
