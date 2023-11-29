package practicepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class spicejet {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//*[local-name()='svg'])[11]")).click();
		WebElement from = driver.findElement(By.xpath("//div[text()='From']"));
		from.click();
		Actions act = new Actions(driver);
		WebElement add = driver.findElement(By.xpath("//div[text()='Bengaluru']"));
		act.moveToElement(add).click().perform();

		WebElement destinaton = driver.findElement(By.xpath(
				"//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']"));
		destinaton.click();
		WebElement add2 = driver.findElement(By.xpath("//div[text()='Delhi']"));
		act.moveToElement(add2).click().perform();
		
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		driver.findElement(By.xpath("//div[text()='November ' and text()='2023']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[text()='19']")).click();

	}
}
