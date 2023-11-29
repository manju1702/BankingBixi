import org.testng.annotations.Test;

public class PracticeTestNG 
{
	@Test(invocationCount =0)
	public void create()
	{
		System.out.println("create class");
	}
	@Test
	public void edit()
	{
		System.out.println("edit test");
	}
	@Test
	public void delete()
	{
		System.out.println("delete test");
	}
	

}
