package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebookalreadyhaveAC {

	public static void main(String[] args) throws InterruptedException {
//open chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(5000);

		//maximize the url
		driver.manage().window().maximize();
		
		//add pageload timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);

		
		//find out the element already have an A/C
		WebElement abc = driver.findElement(By.xpath("//a[text()='Already have an account?']"));
		
		//create object of action by passing webelement
		Actions pqr = new Actions (driver);
		
		//use key down()method by passing keys. Enter
		pqr.keyDown(Keys.ENTER).perform();
		
		Thread.sleep(5000);
		
		//driver.quit();
		
		
	}

}
