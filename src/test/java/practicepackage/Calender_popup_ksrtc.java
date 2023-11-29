package practicepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_popup_ksrtc 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch the empty chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.ksrtc.in/oprs-web/");
		// giving waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("txtJourneyDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[text()='8']")).click();
	
		driver.quit();
		
		
	}

}
