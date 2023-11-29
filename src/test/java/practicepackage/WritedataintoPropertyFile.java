package practicepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritedataintoPropertyFile {
	public static void main(String[] args) throws IOException 
	{
		//create object for properties file
		Properties pobj = new Properties();
		pobj.setProperty("browser", "chrome");
		pobj.setProperty("url", "http://rmgtestingserver:8084/");
		pobj.setProperty("username", "rmgyantra");
		pobj.setProperty("password", "rmgy@9999");
		
		FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\commondata.properties");	
		pobj.store(fout, "write the data in proprties file");
		
		
		
		
		
		
		
		
		
		
		
		
		
																				
		
		//utilize the data
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		pobj.load(fi);
	String	Browser= pobj.getProperty("browser");
	String Url = pobj.getProperty("url");
	String	Username= pobj.getProperty("username");
	String	Password= pobj.getProperty("password");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Url);                                                                
	driver.findElement(By.id("usernmae")).sendKeys(Username);
	driver.findElement(By.id("inputPassword")).sendKeys(Password);
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		}

}
