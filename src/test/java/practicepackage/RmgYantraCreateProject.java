package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RmgYantraCreateProject 
{
	public static void main(String[] args) throws InterruptedException, SQLException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver:8084/");
		WebElement 	username= driver.findElement(By.id("usernmae"));
		username.sendKeys("rmgyantra");
		WebElement 	password= driver.findElement(By.id("inputPassword"));
		password.sendKeys("rmgy@9999");
		WebElement 	signinButton= driver.findElement(By.xpath("//button[text()='Sign in']"));
		signinButton.click();
		//create project
		 driver.findElement(By.xpath("//a[text()='Projects']")).click();
		 driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		 driver.findElement(By.name("projectName")).sendKeys("MY_ITSOLUTION");
		 driver.findElement(By.name("createdBy")).sendKeys("MD NEYAZ");
		WebElement status = driver.findElement(By.name("status"));
		//status.click();
		Thread.sleep(2000);
		Select sel = new Select(status);
		 
		 sel.selectByValue("Created");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

			
		 
	}

}
