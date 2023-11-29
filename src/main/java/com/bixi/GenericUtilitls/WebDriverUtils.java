package com.bixi.GenericUtilitls;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	/**
	 * this method is used to maximize the window
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
/**
 * 
 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public void implicitlywait(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	/**
	 * 
	 */
	public void waitForPageLoad(WebDriver driver,int sec)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	public void waitUntillEleToBeVisible(WebDriver driver,WebElement element,int sec)
	{
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitUntillEleToBeClickable(WebDriver driver,WebElement element,int sec)
	{
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void dropdown(WebElement	 element,int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
	public void dropdown(WebElement	 element,String text)
	{
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	public void dropdown(String value,WebElement	 element)
	{
		Select sel= new Select(element);
		sel.selectByValue(value);
	}
	public void dragAndDrop(WebDriver driver,WebElement from, WebElement to)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).perform();
	}
	public void click(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.click(element).perform();
	}
	
public void doubleClick(WebDriver driver)
{
	Actions act = new Actions(driver);
	act.doubleClick().perform();
}

	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
		
	}
	public void contextClick(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
	}
	public void contextClick(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
		
	}
	public void moveToElement(WebDriver driver ,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void keyPress(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public void keyPressNumber(WebDriver driver) throws Throwable
	{
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_1);
		rb.keyPress(KeyEvent.VK_7);

		rb.keyPress(KeyEvent.VK_0);
		// Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);

		rb.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_9);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_9);
		// Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_9);
		Thread.sleep(500);
	}
	public void keyPress_1() throws AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_1);
	}
	
	public void keyPress_7() throws AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_7);
	}
	
	public void keyPress_tab() throws AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
	}
	
	public void keyPress_0() throws AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_0);
	}
	
	
	
	
	public void keyPress_9() throws AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_9);
	}
	
	
	
	public void keyPressTab(WebDriver driver) throws Throwable
	{
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_T);
	}
	public void keyReleaseEnter(WebDriver driver) throws Throwable
	{
		Robot rb = new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameorid)
	{
		driver.switchTo().frame(nameorid);
	}
	public void switchToFrame(WebDriver driver,WebElement address)
	{
		driver.switchTo().frame(address);
	}
	public void alertPopUp(WebDriver driver)
	{
		driver.switchTo().alert();
	}
	public void alertPopUpAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void alertPopUpDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void scrollBy(WebDriver driver,int x,int y)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void scrollTo(WebDriver driver,int x,int y)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo("+x+","+y+")");
	}
	public void scollUntillElementToBeVisible(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//int y = element.getLocation().getY();
		//jse.executeScript("window.scrollBy(0,"+y+")",element);
		//jse.executeScript("argument[0].scrollIntoView();",element);
		jse.executeScript("argument[0].scrollIntoView(true);",element);
	}
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	public void back(WebDriver driver)
	{
		driver.navigate().back();
	}
	public void forward(WebDriver driver)
	{
		driver.navigate().forward();
	}
public static String getScreenshot(WebDriver driver,String screenshotName)
{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	String Path="./Screenshots/"+screenshotName+".png";
	File dest = new File(Path);
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return Path;
		
}
public void multipleWndowHandle(WebDriver driver)
{
	String parTitle = driver.getTitle();
	String windowtitle = driver.getTitle();
	System.out.println(windowtitle);
	Set<String> allWindowId = driver.getWindowHandles();

	// swith to child window1

	for (String winId : allWindowId) {
		String currTitle = driver.switchTo().window(winId).getTitle();

		if (!currTitle.equals(parTitle))
			break;
	}
	
	
}

public void closebrowser(WebDriver driver) {
	driver.quit();
	
}

}
