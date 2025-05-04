package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tanishqAssignment {

	public static void main(String[] args) {
//open Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//open web url
		driver.get("https://www.tanishq.co.in/#home");
		
		//maximize the url
		driver.manage().window().maximize();
		
		//add page load time out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//find element gold
		WebElement gold = driver.findElement(By.xpath("//a[@id=\"tq-gold\"]"));
		
		//create object of Actions class by passing WebDriver instance or WebDriver object
		Actions wb1 =new Actions(driver);
		wb1.moveToElement(gold).perform();
		
		//find element ring
		WebElement ring = driver.findElement(By.xpath("//a[text()='Rings']"));
		
		//create object of action class by passing Webdriver instance or webdriver object
		Actions wb2 = new Actions(driver);
		wb2.moveToElement(ring).perform();
		
		ring.click();
	}

}
