package practicepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkart {

	// Search for product and fetch all the product name along with price displayed
	// in the flipkart app.

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> allproduct = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> productprice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));

		for(int i=0;i<allproduct.size();i++)
		{
			System.out.println("Name of product is : " + allproduct.get(i).getText()+"Price is : "+productprice.get(i).getText());
			System.out.println("--------------------------------------------------------------------------------------------------------------");
			}
		driver.quit();

	}
	
}
