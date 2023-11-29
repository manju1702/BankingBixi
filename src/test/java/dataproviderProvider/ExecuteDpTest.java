package dataproviderProvider;

import org.testng.annotations.Test;

public class ExecuteDpTest 
{
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "storeData")
	public void execute(String from,String to, int price )
	
	{
		System.out.println("from-----"+from+" to "+to+" price---------"+price);
	}

}
