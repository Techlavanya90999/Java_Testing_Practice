package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dobleclickAssignment {

	public static void main(String[] args) throws InterruptedException {
		//open Chrome browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://demoqa.com/buttons");
		//maximize the browser
		driver.manage().window().maximize();
		////pageload timeout in seconds
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//add implicitly wait for seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		//find the double click button
		WebElement button = driver.findElement(By.xpath("//button[@id=\'doubleClickBtn\']"));
		
		//create object of Action class by passing webdriver instance or object name
		Actions action = new Actions(driver);
		
		//use double click ()method by passing double click webelement instance name and use perform() method to perform actual actions
		action.doubleClick(button).perform();
		
		//find the location of physical text
		WebElement abc = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
		
		//capture the physical text using get text() method
		String a = abc.getText();
		System.out.println(a);
		
		driver.quit();
		
		
		
		
		
	}

}
