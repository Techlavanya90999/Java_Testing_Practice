package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		//open Chrome browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.flipkart.com/");
		//maximize the url
		driver.manage().window().maximize();
		
		//add page load time out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//add implicity
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //find Accounts and List elements
		WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
		//create object of Actions class by passing WebDriver instance or WebDriver object
		Actions action =new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		//find the Your woman ethnic
		WebElement abc = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		action.moveToElement(abc).perform();
		Thread.sleep(5000);

		//find out woman saree
		WebElement saree=driver.findElement(By.xpath("//a[text()='Women Sarees']"));
		action.moveToElement(saree).perform();
		saree.click();
		
		Thread.sleep(5000);

		//find all
		WebElement lmo2 = driver.findElement(By.xpath("//a[text()='All']"));
		
		//find the any one saree product
		WebElement lmo3 = driver
				.findElement(By.xpath("//div[text()='Fabwomen']"));	
		
		//click on product
		lmo3.click();
		driver.quit();
	}

}
