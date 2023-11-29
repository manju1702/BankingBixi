package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	@Test
	public void hardAssertequals() {
		String exp = "A";
		System.out.println("--ts1--");
		System.out.println("--ts2--");
		Assert.assertEquals(exp, "A", "NOT FOUND EXPECTED RESULT");
		System.out.println("--ts3--");
		System.out.println("--ts4--");
	}
@Test
	public void hardAssertNull() {
		//fail the condi
		int a = 50;
		System.out.println("--ts5--");
		Assert.assertNull(a, "a is not null");

	}
@Test
	public void hardAssertNotNull()
	{
		int a =0;
		System.out.println("a is null but i am trying to fail ");
		Assert.assertNotNull(a,"a is not null");
		
	}

}
