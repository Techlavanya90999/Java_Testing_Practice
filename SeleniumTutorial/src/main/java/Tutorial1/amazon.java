package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	public static void main(String[] args)
	{
	//open a browser
	WebDriver driver =new ChromeDriver();

//open a url
	driver.get("https://www.amazon.in");
//maximize browser
	driver.manage().window().maximize();

//add page load time out
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

//add implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
//find Accounts and List elements
	WebElement abc = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));


//create object of Actions class by passing WebDriver instance or WebDriver object
	Actions xyz =new Actions(driver);

//use moveToElement() to mouse over on Account and List Web Elements and use perform() to execute the actions

	xyz.moveToElement(abc).perform();

//find the Your Orders link
WebElement lmo = driver.findElement(By.xpath("//span[text()='Your Orders']"));


//click on Your Orders link
lmo.click();
}
}