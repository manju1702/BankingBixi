package practicepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip_Calender_Popup 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().getPageLoadTimeout();
	driver.get("https://www.makemytrip.com/");
	Actions act = new Actions(driver);
	act.doubleClick().perform();
	
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	
	driver.quit();
}
}
