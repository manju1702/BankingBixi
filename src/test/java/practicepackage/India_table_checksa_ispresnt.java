package practicepackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India_table_checksa_ispresnt
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.icc-cricket.com");
		String countryName="Australia";
		List<WebElement> ele=driver.findElements(By.xpath("(//table/tbody/tr[*]/td[2])[position()=3]"
				+ ""));
		boolean flag = false;
		ArrayList <String> list = new ArrayList();
		for(WebElement webele : ele)
		{
			String countrynames = webele.getText();
			if(countryName.equals(countrynames))
			System.out.println(countrynames);
			flag = true;
			break;	
		}
		if(!flag)
		{
			System.out.println("not present");
			
		}
		driver.quit();
			
		}
	
		
				
	

}
