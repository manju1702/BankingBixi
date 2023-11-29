package practicepackage;                                                                                 

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokerLink 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://amazon.in");
		driver.manage().timeouts().getPageLoadTimeout();
		// find all the link and store
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		// create arraylist
		ArrayList<String> list = new ArrayList<String>();
		// trace to each
		for (int i = 0; i < allLinks.size(); i++) 
		{
			String eachlinks = allLinks.get(i).getAttribute("href");
			URL url = null;
			int statuscode = 0;
			try {
				url = new URL(eachlinks);
				HttpsURLConnection urlconn = (HttpsURLConnection) url.openConnection();
				statuscode = urlconn.getResponseCode();
				// if each link status code is greater than 400 than that consider as broken
				// link and add in arraylist and print those link
				if (statuscode >= 400) 
				{
					list.add(eachlinks);
					System.out.println(eachlinks + statuscode);
				}
			} catch (MalformedURLException M) {

			}
		}
		driver.quit();
	}
}
