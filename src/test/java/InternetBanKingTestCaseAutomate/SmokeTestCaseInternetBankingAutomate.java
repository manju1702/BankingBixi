package InternetBanKingTestCaseAutomate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SmokeTestCaseInternetBankingAutomate {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// launch the empty browser
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
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\internetbankingregister.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet3");
		int count = sh.getLastRowNum();
		Thread.sleep(2000);
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i <= count; i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}

		for (Entry<String, String> set : map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
			// Thread.sleep(1000);
		}

		WebElement DoB = driver.findElement(By.name("dob"));
		DoB.click();
		rbt.keyPress(KeyEvent.VK_1);
		rbt.keyPress(KeyEvent.VK_7);

		rbt.keyPress(KeyEvent.VK_0);
		// Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);

		rbt.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_9);
		Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_9);
		// Thread.sleep(500);
		rbt.keyPress(KeyEvent.VK_9);
		Thread.sleep(500);
		driver.findElement(By.name("submit")).click();
		String confirmationmsg = driver.switchTo().alert().getText();
		System.out.println(confirmationmsg);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		if (confirmationmsg.contains("Registration Successfull"))

			System.out.println("pass" + " customer id genrated and it is verified");
		else
			System.out.println("Fail");

	}
}
