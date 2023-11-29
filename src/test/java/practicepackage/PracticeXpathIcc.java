package practicepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeXpathIcc 
{
	public static void main(String[] args) {
		
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.cricketworldcup.com/");	
	String countryname="IND";	
     String points=driver.findElement(By.xpath("//span[text()='"+countryname+"']/ancestor::tbody/tr[1]/td[5]")).getText();
     int point = Integer.parseInt(points);
    System.out.println(countryname+" "+point);

	}
}
