package practicepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gobibo_calender_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch the empty chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.goibibo.com/");
		// giving waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for(;;)
		try
		{
		driver.findElement(By.xpath("//div[text()='March 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='29']")).click();
		break;
		}
		catch(	Exception e)
		{
          driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

        }
		driver.findElement(By.xpath("//p[text()=' Click to add a return flight for better discounts']")).click();
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		for(;;)
			try
			{
			driver.findElement(By.xpath("//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='19']")).click();
			break;
			}
			catch(	Exception e)
			{
	          driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

	        }
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.quit();
}
}