package TestYanraPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.reporters.jq.Main;

public class WriteDataIntoPropertiesFile01 
{
public static void main(String[] args) throws IOException {
	
	// write the data into properties file
	Properties pobj = new Properties();
	 pobj.setProperty("browser", "chrome");
	pobj.setProperty("url", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	pobj.setProperty("username", "admin");
	pobj.setProperty("password","admin123");
	FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\PracticeCommonData");
	pobj.store(fout,"write data into properties file");
	
	
	
	
}
	

}
