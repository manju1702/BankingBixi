package practicepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc_Calander_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch the empty chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.irctc.co.in/nget/train-search");
		// giving waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		//Thread.sleep(1000);
		Actions act = new Actions(driver);	
		act.doubleClick().perform();
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
driver.quit();
}
}
