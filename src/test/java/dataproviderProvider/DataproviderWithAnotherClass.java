package dataproviderProvider;

import org.testng.annotations.Test;

public class DataproviderWithAnotherClass 
{
	@Test(dataProviderClass = DataproviderExcelTest.class, dataProvider = "storeData")
	public void fetchDataFromExcelWithTheConceptOfDataprovider(String key,String value)
	{
		System.out.println(key +"  "+ value);
	}

}
