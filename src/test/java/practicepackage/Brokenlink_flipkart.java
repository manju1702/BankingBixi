package practicepackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink_flipkart
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://flipkart.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		List<WebElement> alllinks =driver.findElements(By.xpath("//a"));	
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<alllinks.size();i++)
		{
			String eachlink = alllinks.get(i).getAttribute("href");
			URL url = null;
			int statuscode =0;
			try
			{
				url = new URL(eachlink);
				HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
				statuscode = urlconnection.getResponseCode();
				if(statuscode>=400)
				{
					list.add(eachlink);
					System.out.println(eachlink+" -----> "+statuscode);
				}
			}
			catch(MalformedURLException m)
			{
					
			}
		}
		
	}

}
