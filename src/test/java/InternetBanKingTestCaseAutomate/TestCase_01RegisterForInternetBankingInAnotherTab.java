package InternetBanKingTestCaseAutomate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_01RegisterForInternetBankingInAnotherTab 
{
	public static void main(String[] args) throws IOException, Exception 
	{
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fi);
		String Browser = pobj.getProperty("browser");
		String Url = pobj.getProperty("url");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get(Url);

		WebElement internetBankingButton = driver.findElement(By.xpath("//a[contains(.,'Internet Banking')]"));
		Actions act = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,500)");
		WebElement Register = driver.findElement(By.xpath("//li[text()='Register']"));
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ebanking")));

		Thread.sleep(2000);
		String parTitle = driver.getTitle();
		act.moveToElement(internetBankingButton).moveToElement(Register).contextClick(Register).perform();
		Thread.sleep(2000);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_T);

		String windowtitle = driver.getTitle();
		System.out.println(windowtitle);
		Set<String> allWindowId = driver.getWindowHandles();

		// swith to child window1

		for (String winId : allWindowId) {
			String currTitle = driver.switchTo().window(winId).getTitle();

			if (!currTitle.equals(parTitle))
				break;
		}
	
		String ActualTitle = "Internet Banking Registration";
		String ExpectedTitle = "Internet Banking Registration";
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Internet Banking Registration page opened in new tab");
		}
	}
	}

