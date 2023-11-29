package dataproviderProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@DataProvider
	public Object[][] storeData()
	{
		Object obj[][] = new Object[2][3];
		
		//data set first
		obj[0][0]="BANGLORE";
		obj[0][1]="MYSORE";
		obj[0][2]=2000;
		
		//data set second
				obj[1][0]="RAIPUR";
				obj[1][1]="MYSORE";
				obj[1][2]=2000;
				
				
				
		
		return obj;
	}
	@Test(dataProvider = "storeData")
	public void getData(String from,String to,int price)
	{
		System.out.println("From "+from+" To"+to+" price "+price);
	
	
	}

}
